public class JogadorLesionado implements JogadorEstado {

    private JogadorLesionado() {};
    private static JogadorLesionado instance = new JogadorLesionado();
    public static JogadorLesionado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Lesionado";
    }

    public String inscrever(Jogador jogador) {
        return "Inscrição realizada";
    }

    public String vender(Jogador jogador) {
        return "Venda realizada";
    }

    public String lesionar(Jogador jogador) {
        return "Jogador já está Lesionado";
    }
}
