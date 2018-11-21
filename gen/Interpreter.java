import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Interpreter {
    public static void main(String[] args) throws IOException {

        PsicoderLexer lexer = new PsicoderLexer(CharStreams.fromFileName("/home/jesus/IdeaProjects/PsiCoder2/source/in.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PsicoderParser parser = new PsicoderParser(tokens);
        ParseTree tree = parser.s();
        MyVisitor<Object> loader = new MyVisitor<Object>();
        loader.visit(tree);
        //System.out.println(tree);
    }
}
