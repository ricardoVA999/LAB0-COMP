import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

class  tks {
    private String name;
    private int line_pos;
    private  int token_type;

    int getLine_pos() {
        return line_pos;
    }

    void setLine_pos(int line_pos) {
        this.line_pos = line_pos;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getToken_type(){ return  token_type; }

    void setToken_type(int token_type){ this.token_type = token_type; }
}


public class Lab0_Main {
    public static void main(String[] args) throws Exception {
        Boolean contentHasErr = false;
        String fileName = "hola.YAPL";
        System.out.println("Parsing: " + fileName);

        FileInputStream fis = new FileInputStream(new File(fileName));
        ANTLRInputStream input = new ANTLRInputStream(fis);
        YAPLLexer lexer = new YAPLLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        List<tks> list = new ArrayList<>();

        Token token = lexer.nextToken();
        while (token.getType() != YAPLLexer.EOF){
            Boolean is_error = getError(token.getType());
            if(!is_error){
                System.out.println("\n***   Ha ocurrido un error en la linea: "+token.getLine()+" caracter no reconocido: "+token.getText() + "    ***");
                contentHasErr = true;
            }
            tks new_tk = new tks();
            new_tk.setLine_pos(token.getLine());
            new_tk.setName(token.getText());
            new_tk.setToken_type(token.getType());
            list.add(new_tk);
            token = lexer.nextToken();
        }
        System.out.println("\nTodos los tokens encontrados:");
        for(int i = 0; i <= list.size() - 1; i = i + 1){
            if (getError(list.get(i).getToken_type())){
                System.out.println("    - Token encontrado: "+list.get(i).getName()+" en linea: "+list.get(i).getLine_pos()+"");
            }else{
                System.out.println("    - Token encontrado: ERROR en linea: "+list.get(i).getLine_pos()+"");
            }
        }

        if(!contentHasErr){
            System.out.println("\nAnalisis lexico completado con exito");
        } else{
            System.out.println("\nErrores encontrados al realizar analisis lexico");
        }

        FileInputStream fis2 = new FileInputStream(new File(args[0]));
        ANTLRInputStream input2 = new ANTLRInputStream(fis2);
        YAPLLexer lexer2 = new YAPLLexer(input2);

        CommonTokenStream tokens2 = new CommonTokenStream(lexer2);
        YAPLParser parser = new YAPLParser(tokens2);
        SyntaxErrorListener listener = new SyntaxErrorListener();
        parser.removeErrorListeners();
        parser.addErrorListener(listener);
        parser.program();
        List<SyntaxError> errorList = listener.getSyntaxErrors();

        for (int i = 0; i <= errorList.size() - 1; i = i + 1) {
            System.out.println("\n******\nError de sintaxis en la linea: " + errorList.get(i).getLine() +
                    "\n       -Se encontro: " + errorList.get(i).getOffendingSymbol() +
                    "\n       -Se esperaba: " + errorList.get(i).getMessage() + "\n******");
        }
        if (errorList.size() < 1) {
            System.out.println("\nAnalisis sintactico completado con exito");
        } else {
            System.out.println("\nErrores encontrados al realizar analisis sintactico");
        }

        if (errorList.size() < 1 && !contentHasErr){
            Runtime.getRuntime().exec("/bin/bash -c java org.antlr.v4.gui.TestRig YAPL program -gui hola.YAPL");

        }

    }
    private static Boolean getError(int tokenType) {
        return tokenType != YAPLLexer.ERR_TOKEN;
    }
}

class SyntaxErrorListener extends BaseErrorListener
{
    private final List<SyntaxError> syntaxErrors = new ArrayList<>();

    SyntaxErrorListener()
    {
    }

    List<SyntaxError> getSyntaxErrors()
    {
        return syntaxErrors;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e)
    {
        syntaxErrors.add(new SyntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e));
    }

    @Override
    public String toString()
    {
        return Utils.join(syntaxErrors.iterator(), "\n");
    }
}

class SyntaxError
{
    private final Recognizer<?, ?> recognizer;
    private final Object offendingSymbol;
    private final int line;
    private final int charPositionInLine;
    private final String message;
    private final RecognitionException e;

    SyntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
    {
        this.recognizer = recognizer;
        this.offendingSymbol = offendingSymbol;
        this.line = line;
        this.charPositionInLine = charPositionInLine;
        this.message = msg;
        this.e = e;
    }

    public Recognizer<?, ?> getRecognizer()
    {
        return recognizer;
    }

    public Object getOffendingSymbol()
    {
        return offendingSymbol;
    }

    public int getLine()
    {
        return line;
    }

    public int getCharPositionInLine()
    {
        return charPositionInLine;
    }

    public String getMessage()
    {
        return message.split("expecting")[1];
    }

    public RecognitionException getException()
    {
        return e;
    }
}