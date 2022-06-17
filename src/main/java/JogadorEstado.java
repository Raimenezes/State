public interface JogadorEstado {

    String getEstado();

    String inscrever(Jogador jogador);

    String vender(Jogador jogador);

    String lesionar(Jogador jogador);
}
