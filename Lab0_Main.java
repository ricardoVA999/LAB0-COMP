import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

class  tks {
    private String token_type;
    private int line_pos;

    int getLine_pos() {
        return line_pos;
    }

    void setLine_pos(int line_pos) {
        this.line_pos = line_pos;
    }

    String getToken_type() {
        return token_type;
    }

    void setToken_type(String token_type) {
        this.token_type = token_type;
    }
}


public class Lab0_Main {
    public static void main(String[] args) throws Exception {
        Boolean contentHasErr = false;
        System.out.println("Parsing: " + args[0]);

        FileInputStream fis = new FileInputStream(new File(args[0]));
        ANTLRInputStream input = new ANTLRInputStream(fis);
        YAPLLexer lexer = new YAPLLexer(input);

        List<tks> list = new ArrayList<>();

        Token token = lexer.nextToken();
        while (token.getType() != YAPLLexer.EOF){
            Boolean is_error = getError(token.getType());
            if(!is_error){
                System.out.print("Ha ocurrido un error en la linea: "+token.getLine()+" caracter no reconocido: "+token.getText()+"\n");
                contentHasErr = true;
            }
            tks new_tk = new tks();
            new_tk.setLine_pos(token.getLine());
            new_tk.setToken_type(token.getText());
            list.add(new_tk);
            token = lexer.nextToken();
        }
        System.out.print("Todos los tokens encontrados:\n");
        for(int i = 0; i <= list.size() - 1; i = i + 1){
            System.out.print("Token encontrado: "+list.get(i).getToken_type()+" en linea: "+list.get(i).getLine_pos()+"\n");
        }

        if(!contentHasErr){
            System.out.print("Analisis lexico completado con exito\n");
        }else{
            System.out.println("Errores encontrados al realizar analisis lexico");
        }
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        YAPLParser parser = new YAPLParser(tokens);

        ParseTree tree = parser.file();
        
    }
    private static Boolean getError(int tokenType) {
        return tokenType != YAPLLexer.ERR_TOKEN;
    }
}