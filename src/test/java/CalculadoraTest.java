import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

  @Test
  void testeSomar() {
    Calculadora calculadora = new Calculadora();
    assertEquals(34, calculadora.somar(32, 2));
  }

  @Test
  void testeSubtrair() {
    Calculadora calculadora = new Calculadora();
    assertEquals(1, calculadora.subtrair(3, 2));
  }

}
