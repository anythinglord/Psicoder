

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MyVisitor<T> extends PsicoderBaseVisitor {
    HashMap<String, Object> table = new HashMap<>();
    HashMap<String, ArrayList<Object>> funciones = new HashMap<>();

    boolean contcoma = false;

    @Override
    public T visitCode(PsicoderParser.CodeContext ctx) {
        //System.out.println("in code");
        return (T) visitChildren(ctx);
        //return null;
    }

    @Override
    public T visitDeclaracion(PsicoderParser.DeclaracionContext ctx) {
        System.out.println("in Declaracion");
        return (T) visitChildren(ctx);
        //return null;
    }

    @Override
    public T visitSimple(PsicoderParser.SimpleContext ctx) {
        System.out.println("in Simple");
        //System.out.println(ctx.getText());
        String response = (String)visitEsperado(ctx.esperado());
        if(response == null){
            String key = String.valueOf(ctx.esperado().ID());
            table.put(key,null);
        }else{
            //System.out.println("si hay funcion"+);
            String key = String.valueOf(ctx.esperado().ID());
            String value = (String) visitEsperado(ctx.esperado());
            //System.out.println("type in simple:"+visitTipo(ctx.tipo()));

            // si son declaraciones sin tipo de dato
            if (ctx.tipo() != null){
                String c = (String) visitTipo(ctx.tipo());
                if(c.equals("caracter")||c.equals("cadena") ){
                    value = value.substring(1,value.length()-1);
                }
            }
            table.put(key,value);
        }
        return (T)visitChildren(ctx);

    }
    @Override
    public T visitEsperado(PsicoderParser.EsperadoContext ctx) {
        System.out.println("in Esperado");
        //System.out.println(ctx.getText());
        if (ctx.ID() != null) {
            return visitSiguiente(ctx.siguiente());
        }
        return (T) super.visitEsperado(ctx);
        //return null;
    }

    @Override
    public T visitSiguiente(PsicoderParser.SiguienteContext ctx) {
        //System.out.println("in Siguiente");
        if (ctx.TK_ASIG() != null) {
            return (T) visitEleccion(ctx.eleccion());
        } else {
            return (T) visitChildren(ctx);
        }
        //return (T)visitChildren(ctx);
        //return null;
    }


    @Override
    public T visitEleccion(PsicoderParser.EleccionContext ctx) {
        System.out.println("in Eleccion");

        if(ctx.ID()!=null){
            // evaluar el retorno de las funciones
            String fun = ctx.ID().getText();
            System.out.println("fun: "+fun);
            System.out.println(funciones.get(fun));
            if(funciones.get(fun) == null){

            }else{
                Object body = funciones.get(fun).get(0);
                Object ret = funciones.get(fun).get(1);
                //System.out.println("cuerpo de la fun: "+funciones.get(fun).get(0));
                //System.out.println(visitSimple(body));

            }
            System.out.println("eleccion!"+ctx.ID().getText());
            //return visitSimple(ctx.simple());
            return null;
        }else{
            return (T) visitChildren(ctx);
        }
        //return (T) super.visitEleccion(ctx);
    }

    @Override
    public T visitComplex(PsicoderParser.ComplexContext ctx) {
        System.out.println("in Complex");
        if (ctx.TK_COMA() != null) {
            return (T) visitAdicion(ctx.adicion());
        }
        return (T) super.visitComplex(ctx);
    }

    @Override
    public T visitAdicion(PsicoderParser.AdicionContext ctx) {
        System.out.println("in Adicion");
        return (T)visitChildren(ctx);
    }

    @Override
    public T visitControl(PsicoderParser.ControlContext ctx) {
        System.out.println("in Control");
        return (T) visitChildren(ctx);
    }

    @Override
    public T visitStream(PsicoderParser.StreamContext ctx) {
        //System.out.println("in Stream");

        //if (ctx.cuerpo().getText().contains(",")==true){contcoma = true;}
        if (ctx.TK_ROMPER() != null) {
            return (T) ctx.TK_ROMPER().getText();
        } else if (ctx.TK_LEER() != null) {
            System.out.println("leer");
            Scanner sc = new Scanner(System.in);
            String in = sc.next();
            System.out.println(in);
        } else if (ctx.TK_IMPRIMIR() != null) {
            return (T) visitCuerpo(ctx.cuerpo());
        } else if (ctx.ID() != null) {
            // se llaman las funciones
            if (funciones.get(ctx.ID().getText()) != null){

            }else{
                System.out.println("No esta definida la funcion");
            }
            //return (T) visitSimple(ctx.simple());

        }
        return (T) super.visitStream(ctx);
    }

    @Override
    public T visitCuerpo(PsicoderParser.CuerpoContext ctx) {
        System.out.println("in Cuerpo");

        if(ctx.ID()!=null){
            Object a  = table.get(ctx.ID().getText());
            if(visitOtro(ctx.otro())==null){
                //Object a  = table.get(ctx.ID().getText());
                //System.out.println("otro nill");
                //System.out.println("lo otro: "+ctx.otro().operacion().ID().get(0));
                if(a == null){
                    System.out.println(ctx.ID().getText()+" no se ha inicializado");
                }else {
                    System.out.println(a);
                }

            }else{
                int val = Integer.parseInt((String)a) + Integer.parseInt(ctx.otro().operacion().valor(0).getText());
                System.out.println(val);
                //System.out.println("mas cosas si hay ,");
            }

            //return (T)visitMas(ctx.mas());
        }else{

            Object a;
            if((a = visitChildren(ctx))==null){
                String value = (String)visitValor(ctx.valor());
                if(value.charAt(0)==239 ||value.charAt(0)==34 ){
                    System.out.println(value.substring(1,value.length()-1));
                }else{
                    System.out.println(value);
                }

            }else {
                String op = (String) visitOperando(ctx.otro().operacion().operando(0));
                int num = Integer.parseInt((String)visitValor(ctx.otro().operacion().valor(0)));
                int valor = Integer.parseInt((String) visitValor(ctx.valor()));
                int result ;
                switch (op){

                    case "+":
                        result = valor + num;
                        System.out.println(result);
                        break;
                    case "-":
                        result = valor - num;
                        System.out.println(result);
                        break;
                    case "*":
                        result = valor * num;
                        System.out.println(result);
                        break;
                    case "/":
                        result = valor / num;
                        System.out.println(result);
                        break;
                    case "%":
                        result = valor % num;
                        System.out.println(result);
                        break;
                }
            }
            //return (T)visitChildren(ctx);


        }
        return null;
    }
    @Override
    public T visitOtro(PsicoderParser.OtroContext ctx) {
        System.out.println("in Otro");
        return (T)visitChildren(ctx);

    }

    /*
    @Override
    public T visitM(PsicoderParser.MContext ctx){
        System.out.println("in M");
        if(visitChildren(ctx) !=null){
            System.out.println("no null");
            String var = (String)visitChildren(ctx);
            System.out.println("var: "+var);
            if (var.charAt(0)>= 48 && var.charAt(0)<= 57){
                System.out.println(var);
            }else{
                System.out.println(table.get(var));
            }
            //System.out.println("vtx:"+visitVt(ctx.a().vt()));
            //System.out.println(table.get(var));

        }
        //return (T)visitChildren(ctx);
        return null;
    }*/

    @Override
    public T visitMas(PsicoderParser.MasContext ctx) {
        System.out.println("in Mas");
        if (ctx.TK_COMA() != null) {
            return (T)visitCuerpo(ctx.cuerpo());
        }
        return (T) super.visitMas(ctx);
    }

    @Override
    public T visitAritmetico(PsicoderParser.AritmeticoContext ctx) {
        System.out.println("in Aritmetico");
        if (ctx.ID() != null) {
            return (T) visitOperacion(ctx.operacion());
        } else {
            return (T) visitChildren(ctx);
        }

    }

    @Override
    public T visitOperacion(PsicoderParser.OperacionContext ctx) {
        System.out.println("in Operacion");

        return (T) visitChildren(ctx);
    }

    @Override
    public T visitCondicion(PsicoderParser.CondicionContext ctx) {
        System.out.println("in Condicion");
        if (ctx.ID() != null) {
            return (T) visitLogico(ctx.logico());
        } else {
            return (T) visitChildren(ctx);
        }
    }
    @Override
    public T visitOtrascond(PsicoderParser.OtrascondContext ctx) {
        System.out.println("in Otras Cond");
        if (ctx.ID() != null) {
            return (T) ctx.ID().getText();
        } else {
            return (T) visitChildren(ctx);
        }
    }

    @Override
    public T visitTipo(PsicoderParser.TipoContext ctx) {
        //System.out.println("in Tipo");
        //System.out.println("ctx in Tipo: "+ctx.getText());
        if (ctx.TK_CHAR() != null) {
            return (T) ctx.TK_CHAR().getText();
        } else if (ctx.TK_BOOL() != null) {
            return (T) ctx.TK_BOOL().getText();
        } else if (ctx.TK_CAD() != null) {
            return (T) ctx.TK_CAD().getText();
        } else if (ctx.TK_INT() != null) {
            //System.out.println("sirve el int");
            return (T) ctx.TK_INT().getText();
        } else if (ctx.TK_DOUBLE() != null) {
            return (T) ctx.TK_DOUBLE().getText();
        }
        return null;
    }

    @Override
    public T visitF(PsicoderParser.FContext ctx) {
        System.out.println("in Funcion");
        /*System.out.println("ctx in fun: "+ctx.getText());
        System.out.println("ctx in fun: "+ctx.simple().getText());
        System.out.println("ctx ID: "+ctx.ID().getText());
        System.out.println("ctx code : "+ctx.code().getText());*/
        if (ctx.TK_FUNCION() != null) {
            if(funciones.get(ctx.ID().getText()) == null){
                System.out.println("no esta");
                ArrayList<Object> contenidos = new ArrayList<>();
                contenidos.add(ctx.code().getText());
                contenidos.add(ctx.tiporet().getText());
                funciones.put(ctx.ID().getText(),contenidos);
                System.out.println("funciones: "+funciones.get("sum"));
            }else{
                System.out.println("ya esta definida la funcion");
            }
            //return visitTipo(ctx.tipo());
            visitTipo(ctx.tipo());
        }
        return null;
    }

    @Override
    public T visitTiporet(PsicoderParser.TiporetContext ctx) {
        System.out.println("in tipo ret");
        return (T)visitChildren(ctx);
    }

    @Override
    public T visitIfy(PsicoderParser.IfyContext ctx) {
        System.out.println("in if");
        if (ctx.TK_SI() != null) {

            String op = ctx.condicion().logico().getText();
            String[] oper = new String[2];
            oper = ctx.condicion().getText().split("<");
            double num1,num2;
            Boolean ans = null;
            if(oper[0].charAt(0)>=48 & oper[0].charAt(0) <= 57){
                num1 = Double.parseDouble(oper[0]);
            }else{
                num1 = Double.parseDouble((String) table.get(oper[0]));
            }
            System.out.println(oper[1].charAt(0));
            if(oper[1].charAt(0)>=48 & oper[1].charAt(0) <= 57){
                num2 = Double.parseDouble(oper[1]);
            }else{
                num2 = Double.parseDouble((String) table.get(oper[1]));
            }

            switch (op){
                case "<":
                    ans = num1 < num2;
                    break;
                case "<=":
                    ans = num1 <= num2;
                    break;
                case ">":
                    ans = num1 > num2;
                    break;
                case ">=":
                    ans = num1 >= num2;
                    break;
                case "==":
                    ans = Math.abs(num1 - num2) < 0000000.1;
                    break;
                case "!=":
                    ans = Math.abs(num1 - num2) > 0000000.1;
                    break;
            }
            if (ans){
                visitCode(ctx.code());
            }else {
                visitElsey(ctx.elsey());
            }

            return null;
            //return visitCondicion(ctx.condicion());
        }
        return (T) super.visitIfy(ctx);
    }

    @Override
    public T visitElsey(PsicoderParser.ElseyContext ctx) {
        System.out.println("in code");
        if (ctx.TK_SINO() != null) {
            return visitCode(ctx.code());
        }
        return (T) super.visitElsey(ctx);
    }

    @Override
    public T visitFory(PsicoderParser.ForyContext ctx) {
        if (ctx.TK_PARA() != null) {
            String value = ctx.simple().esperado().siguiente().eleccion().valor().getText();
            String var = (String) ctx.simple().esperado().ID().getText();
            //System.out.println("var;"+var);
            String var1 = ctx.condicion().otrascond().valor().getText();
            String var2 = ctx.valor().getText();
            int start = Integer.parseInt(value);
            table.put(var,value);
            int valor = Integer.parseInt(var1);
            int a = Integer.parseInt(var2);
            for (int i = start; i < valor   ; i= i + a) {
                visitCode(ctx.code());
                table.put(var,start=start+1);
            }
            //return visitSimple(ctx.simple(0));
            return null;
        }
        return (T) super.visitFory(ctx);
    }

    @Override
    public T visitWhiley(PsicoderParser.WhileyContext ctx) {
        System.out.println("in while");
        if (ctx.TK_MIENTRAS() != null) {

            //String op = ctx.condicion().logico().getText();
            //String var = ctx.condicion().ID().getText();
            //double valor = Double.parseDouble(ctx.condicion().otrascond().valor().getText());
            // valor de la varuable
            //double value = Double.parseDouble((String) table.get(var));
            //System.out.println("valor de a en la table: "+value);
            /*
            boolean cod = false;
            switch (op){
                case "<":
                    cod = value < valor ;
                    while (cod){
                        cod = value < valor ;
                        visitCode(ctx.code());
                        value ++;
                    }
                    break;
                case "<=":
                    cod = value <= valor;
                    while (cod){
                        cod = value <= valor ;
                        visitCode(ctx.code());
                        value ++;
                    }
                    break;
                case ">":
                    cod = value > valor;
                    while (cod){
                        cod = value > valor ;
                        visitCode(ctx.code());
                        value ++;
                    }
                    break;
                case ">=":
                    cod = value >= valor;
                    while (cod){
                        cod = value >= valor ;
                        visitCode(ctx.code());
                        value ++;
                    }
                    break;
            }
            */
            visitCode(ctx.code());
            //System.out.println("condicion:: "+ctx.condicion().getText());
            if(ctx.code().declaracion()==null){

            }else{
                if(ctx.code().declaracion(0).simple().esperado().ID().getText()==var){
                    
                }
                System.out.println("si hay algo");
            }
            System.out.println("code: "+);

            /*boolean a=true;
            while(a){
                a = i < 5;
                System.out.println(i);
                i= i +1 ;
            }*/
            System.out.println(ctx.condicion().ID().getText());

            return null;
        }
        return (T) super.visitWhiley(ctx);
    }

    @Override
    public T visitDo_whiley(PsicoderParser.Do_whileyContext ctx) {
        if (ctx.TK_HACER() != null) {
            return visitCode(ctx.code());
        }
        return (T) super.visitDo_whiley(ctx);
    }

    @Override
    public T visitSwitchy(PsicoderParser.SwitchyContext ctx) {
        if (ctx.TK_SELECCIONAR() != null) {
            return (T) visitCasey(ctx.casey(0));
        }
        return (T) super.visitSwitchy(ctx);
    }

    @Override
    public T visitCasey(PsicoderParser.CaseyContext ctx) {
        System.out.println("in Casey");
        if (ctx.TK_CASO() != null) {
            return (T) visitValor(ctx.valor());
        } else if (ctx.TK_DEFECTO() != null) {
            return (T) visitDeclaracion(ctx.declaracion());
        }
        return (T) super.visitCasey(ctx);
    }

    @Override
    public T visitE(PsicoderParser.EContext ctx) {
        if (ctx.TK_ESTRUCTURA() != null) {
            return (T) visitSimple(ctx.simple());
        }
        return (T) super.visitE(ctx);
    }

    @Override
    public T visitValor(PsicoderParser.ValorContext ctx) {
        //System.out.println("in Valor");
        if (ctx.TK_ENTERO() != null) {
            //System.out.println("valor-entero: "+ctx.TK_ENTERO().getText());
            return (T) ctx.TK_ENTERO().getText();
        } else if (ctx.TK_REAL() != null) {
            return (T) ctx.TK_REAL().getText();
        } else if (ctx.TK_CADENA() != null) {
            return (T) ctx.TK_CADENA().getText();
        } else if (ctx.TK_CARACTER() != null) {
            return (T) ctx.TK_CARACTER().getText();
        } else if (ctx.VERDADERO() != null) {
            return (T) ctx.VERDADERO().getText();
        } else if (ctx.FALSO() != null) {
            return (T) ctx.FALSO().getText();
        }
        return (T) super.visitValor(ctx);
    }

    @Override
    public T visitOperando(PsicoderParser.OperandoContext ctx) {
        System.out.println("in Operando");
        if (ctx.TK_MAS() != null) {
            //System.out.println("opa +");
            return (T) ctx.TK_MAS().getText();
        } else if (ctx.TK_MENOS() != null) {
            return (T) ctx.TK_MENOS().getText();
        } else if (ctx.TK_MULT() != null) {
            return (T) ctx.TK_MULT().getText();
        } else if (ctx.TK_DIV() != null) {
            return (T) ctx.TK_DIV().getText();
        } else if (ctx.TK_MOD() != null) {
            return (T) ctx.TK_MOD().getText();
        }
        return (T) super.visitOperando(ctx);
    }

    @Override
    public T visitLogico(PsicoderParser.LogicoContext ctx) {

        if (ctx.TK_MENOR() != null) {
            return (T) ctx.TK_MENOR().getText();
        } else if (ctx.TK_MAYOR() != null) {
            return (T) ctx.TK_MAYOR().getText();
        } else if (ctx.TK_MENOR_IGUAL() != null) {
            return (T) ctx.TK_MENOR_IGUAL().getText();
        } else if (ctx.TK_MAYOR_IGUAL() != null) {
            return (T) ctx.TK_MAYOR_IGUAL().getText();
        } else if (ctx.TK_IGUAL() != null) {
            return (T) ctx.TK_IGUAL().getText();
        } else if (ctx.TK_Y() != null) {
            return (T) ctx.TK_Y().getText();
        } else if (ctx.TK_O() != null) {
            return (T) ctx.TK_O().getText();
        } else if (ctx.TK_DIF() != null) {
            return (T) ctx.TK_DIF().getText();
        } else if (ctx.TK_NEG() != null) {
            return (T) ctx.TK_NEG().getText();
        }
        return (T) super.visitLogico(ctx);
    }

    /*
    @Override
    public T visitDy(PsicoderParser.DyContext ctx){
        System.out.println("in DY");
        String value = ctx.a().getText();
        table.put(ctx.d().getText(),value.substring(1));
        return (T)visitChildren(ctx);
        //return null;
    }
    */
    // FAlta completarlo



    /*
    @Override
    public T visitD1(PsicoderParser.D1Context ctx){
        System.out.println("in D1");
        if(ctx.TK_PUNTO()!=null){
            String name = ctx.ID().getText();
            Object value;
            if( (value = table.get(name))==null){
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                //Prodría ser en .out tambien.
                System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + name + "\" no fue declarada.\n",line,col);
                System.exit(-1);
                return null;
            }else{
                return (T)value;
            }
        }
        else if(ctx.ID()!=null){
            return visitD1(ctx.d1());
        }
        else if(ctx.TK_COMA()!=null){
            return visitD1(ctx.d1());
        }
        else if(ctx.TK_PYC()!=null){
            return (T)ctx.TK_PYC().getText();
        }
        return null;
    }
    @Override
    public T visitA(PsicoderParser.AContext ctx){
        System.out.println("in A");
        if(ctx.TK_ASIG()!=null){
            System.out.println("igualito-a");
            return visitA(ctx.a());
        }else if(ctx.TK_PAR_IZQ()!=null){
            return visitA(ctx.a());
        }else {
            String response = (String)visitChildren(ctx);
            if (response == null){

                if (ctx.a2().getText().equals("")){
                    return (T)ctx.vt().getText();
                }else{

                    String normal = ctx.a2().getText();
                    String op = normal.substring(0,1);
                    int result = 0;
                    int num = Integer.parseInt(normal.substring(1));
                    switch (op){
                        case "+":
                            result = Integer.parseInt(ctx.vt().getText()) + num;
                            break;
                    }

                    System.out.println("ese op: "+result);
                    return (T)String.valueOf(result);
                }

            }else{
                return (T)visitChildren(ctx);
            }
            //return (T)visitChildren(ctx);
        }
        //return (T)super.visitA(ctx);
        //return null;
    }
    */

}
