
public class relleneArray {

	public static void main(String[] args) {
		relleneArray();
	}
	
	public static void relleneArray () {
		int array [] = new int[10];
		// Inicializaci�n del array
				// Para asignar n�meros al azar entre un l�mite inferior y otro superior
				// utilizaremos la siguiente f�rmula
				//   n�meroAleatorio * (limiteSuperior - limiteInferior)  +  limiteInferior
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (20 - 1) + 1);
		}
		// Impresi�n del array 
				System.out.println();
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + " ");
				}
		
	}
}
