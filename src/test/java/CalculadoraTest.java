import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    public void pruebaSumar() {

        assertEquals(5,calculadora.sumar(3,2));
    }

    @Test
    void pruebaRestar() {

        assertEquals(2,calculadora.restar(5,2));
    }

    @Test
    void pruebaDividir() {

        assertEquals(4, calculadora.dividir(24,6));
    }
}