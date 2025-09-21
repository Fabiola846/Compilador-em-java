public class Token {
    public enum TipoToken {
        IDENTIFICADOR,
        CONSTANTE,
        SIMBOLO,
        PALAVRA_RESERVADA,
        OPERADOR,
        FIM_DE_ARQUIVO,
        ERRO
    }

    private String lexema;
    private TipoToken tipo;

    public Token(String lexema, TipoToken tipo) {
        this.lexema = lexema;
        this.tipo = tipo;
    }

    public String getLexema() {
        return lexema;
    }

    public TipoToken getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Token [Lexema: '" + lexema + "', Tipo: " + tipo + "]";
}
}