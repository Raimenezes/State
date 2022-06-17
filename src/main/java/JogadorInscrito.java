public class JogadorInscrito implements JogadorEstado {

    private JogadorInscrito() {};
    private static JogadorInscrito instance = new JogadorInscrito();
    public static JogadorInscrito getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Inscrito";
    }

    public String inscrever(Jogador jogador) {
        return "Inscrição não realizada";
    }

    public String vender(Jogador jogador) {
        jogador.setEstado(JogadorVendido.getInstance());
        return "Venda realizada";
    }

    public String lesionar(Jogador jogador) {
        jogador.setEstado(JogadorLesionado.getInstance());
        return "Jogador Lesionado";
    }
}
