
public class relleneArray {

	public static void main(String[] args) {
		relleneArray();
	}
	
	public static void relleneArray () {
		int array [] = new int[10];
		int sumaPares = 0, sumaImpares = 0;
		// Inicializaci�n del array
				// Para asignar n�meros al azar entre un l�mite inferior y otro superior
				// utilizaremos la siguiente f�rmula
				//   n�meroAleatorio * (limiteSuperior - limiteInferior)  +  limiteInferior
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (20 - 1) + 1);
		}	
	}
	public static void sumarNumerosParesImpares () {
		// C�lculo de las sumas de n�meros pares e impares
		for (int i = 0; i < array.length; i++) {
			if ((array[i] & 1) == 1) { // Una forma original de calcular los n�meros impares
				sumaImpares += array[i];
			}
			else { // Lo que no es impar, es par
					sumaPares += array[i];
			}
		}
	}
}
