import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

	Calculadora calc = new Calculadora();
	@Test
	void testSuma() {
		assertEquals(5, calc.sumar(2,3));
	}
	
	@Test
	void testDivision() {
		assertEquals(2, calc.dividir(10,5));
	}
	
	@Test
	void testDivisionPorCero() {
		
		Exception ex = assertThrows(IllegalArgumentException.class, () -> calc.dividir(10,0));
				
				assertEquals("No se puede divir entre cero",ex.getMessage());
	}
	
	@Test
	void tesMultiplicacion() {
		assertEquals(10, calc.multiplicacion(5,2));
	}
	
	@Test
	void testResta() {
		assertEquals(4, calc.resta(6, 2));
	}
}
