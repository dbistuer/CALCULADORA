import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        // Arrange
        Calculadora calculadora = new Calculadora();
        int numero1 = 5;
        int numero2 = 7;

        // Act
        int resultado = calculadora.sumar(numero1, numero2);

        // Assert
        assertEquals(12, resultado);
    }

    @Test
    public void testRestar() {
        // Arrange
        Calculadora calculadora = new Calculadora();
        int numero1 = 10;
        int numero2 = 4;

        // Act
        int resultado = calculadora.restar(numero1, numero2);

        // Assert
        assertEquals(6, resultado);
    }

    @Test
    public void testMultiplicar() {
        // Arrange
        Calculadora calculadora = new Calculadora();
        int numero1 = 3;
        int numero2 = 5;

        // Act
        int resultado = calculadora.multiplicar(numero1, numero2);

        // Assert
        assertEquals(15, resultado);
    }
}