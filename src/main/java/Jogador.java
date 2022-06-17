public class Jogador {

    private String nome;
    private JogadorEstado estado;

    public Jogador() {
        this.estado = JogadorInscrito.getInstance();
    }

    public void setEstado(JogadorEstado estado) {
        this.estado = estado;
    }

    public String inscrever() {
        return estado.inscrever(this);
    }

    public String vender() {
        return estado.vender(this);
    }

    public String lesionar() {
        return estado.lesionar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public JogadorEstado getEstado() {
        return estado;
    }
}
