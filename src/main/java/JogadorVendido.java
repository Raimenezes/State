public class JogadorVendido implements JogadorEstado {

    private JogadorVendido() {};
    private static JogadorVendido instance = new JogadorVendido();
    public static JogadorVendido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Vendido";
    }

    public String inscrever(Jogador jogador) {
        return "Inscrição não realizada";
    }

    public String vender(Jogador jogador) {
        return "Venda não realizada";
    }

    public String lesionar(Jogador jogador) {
        return "Jogador não se Lesionou";
    }
}
