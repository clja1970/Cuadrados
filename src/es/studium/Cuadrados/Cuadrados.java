package es.studium.Cuadrados;

public class Cuadrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("La suma de los cuadrados de los primeros 100 números es: " + cuadrados());

	}

	public static int cuadrados() {
		int b, i;
		b = 0;
		for (i = 0; i <= 100; i++) {
			b = (i * i) + b;
		}
		return b;

	}
}
