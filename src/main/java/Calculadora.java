
public class Calculadora {
	
public int sumar(int a,  int b) {
	return a + b;
}

public int dividir(int a, int b) {
	if (b == 0) throw new IllegalArgumentException("No se puede divir entre cero");

	return a / b;
}


public int multiplicacion(int a, int b) {
	return a * b;
}


public int resta (int a, int b) {	
	return a - b;
}

}
