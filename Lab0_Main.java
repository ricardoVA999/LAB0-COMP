import java.io.File;
import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;



public class Lab0_Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Parsing: " + args[0]);

        FileInputStream fis = new FileInputStream(new File(args[0]));
        ANTLRInputStream input = new ANTLRInputStream(fis);
        YAPLLexer lexer = new YAPLLexer(input);

        Token token = lexer.nextToken();
        while (token.getType() != YAPLLexer.EOF) {
            System.out.println("\t" + getTokenType(token.getType()) + " --> " + token.getText() + " Linea " + token.getLine());
            token = lexer.nextToken();
        }
    }
    private static String getTokenType(int tokenType) {
        switch (tokenType) {
            case YAPLLexer.ERR_TOKEN:
                return "ERROR";
            default:
                return "OTRO";
        }
    }
}