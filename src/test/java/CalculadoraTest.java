import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes da classe Calculadora")
public class CalculadoraTest {

  @Test
  @DisplayName("Teste do método somar")
  void testeSomar() {
    Calculadora calculadora = new Calculadora();
    assertEquals(34, calculadora.somar(32, 2));
  }

  @Test
  @DisplayName("Teste do método subtrair")
  void testeSubtrair() {
    Calculadora calculadora = new Calculadora();
    assertEquals(1, calculadora.subtrair(3, 2));
  }

  @Test
  @DisplayName("Teste do método dividir")
  void testeDividir() {
    Calculadora calculadora = new Calculadora();
    assertEquals(3, calculadora.dividir(6, 2));
  }

  @Test
  @DisplayName("Teste da exceção do método dividir")
  void testeDividirExcecao() {
    Calculadora calculadora = new Calculadora();
    assertThrows(ArithmeticException.class, () -> {
      calculadora.dividir(3, 0);
    });
  }

}
