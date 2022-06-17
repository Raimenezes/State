import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JogadorTest {

    Jogador jogador;

    // jogador inscrito

    @BeforeEach
    public void setUp() {
        jogador = new Jogador();
    }

    @Test
    public void naoDeveInscreverJogadorInscrito() {
        jogador.setEstado(JogadorInscrito.getInstance());
        assertEquals("Inscrição não realizada", jogador.inscrever());
    }

    @Test
    public void deveVenderJogadorInscrito() {
        jogador.setEstado(JogadorInscrito.getInstance());
        assertEquals("Venda realizada", jogador.vender());
    }

    @Test
    public void deveLesionarJogadorInscrito() {
        jogador.setEstado(JogadorInscrito.getInstance());
        assertEquals("Jogador Lesionado", jogador.lesionar());
    }

    // jogador vendido

    @Test
    public void naoDeveInscreverJogadorVendido() {
        jogador.setEstado(JogadorVendido.getInstance());
        assertEquals("Inscrição não realizada", jogador.inscrever());
    }

    @Test
    public void naoDeveVenderJogadorVendido() {
        jogador.setEstado(JogadorVendido.getInstance());
        assertEquals("Venda não realizada", jogador.vender());
    }

    @Test
    public void naoDeveLesionarJogadorVendido() {
        jogador.setEstado(JogadorVendido.getInstance());
        assertEquals("Jogador não se Lesionou", jogador.lesionar());
    }

    // jogador lesionado

    @Test
    public void deveInscreverJogadorLesionado() {
        jogador.setEstado(JogadorLesionado.getInstance());
        assertEquals("Inscrição realizada", jogador.inscrever());
    }

    @Test
    public void deveVenderJogadorLesionado() {
        jogador.setEstado(JogadorLesionado.getInstance());
        assertEquals("Venda realizada", jogador.vender());
    }

    @Test
    public void naodeveLesionarJogadorLesionado() {
        jogador.setEstado(JogadorLesionado.getInstance());
        assertEquals("Jogador já está Lesionado", jogador.lesionar());
    }

}
