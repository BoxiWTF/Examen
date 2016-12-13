import java.util.Scanner;
/**Documentacion del programa
 * @author Carlos
 * @author ejemplo@ejemplo.com
 * @version 1.0 */

public class Ejercicio1{
	/** Documentacion del metodo
	 * @param valorMenor es un entero de entrada
	 * @param valorMayor es otro entero de entrada
	 * @return un numero entero que es la media */
	public static double calcularValorMedio(int valorMenor, int valorMayor){
		double number1 = valorMenor;
		double number2 = valorMayor;
		double media = ((number1+number2)/2);
		return media;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero1 = sc.nextInt();
		System.out.println("Introduce otro numero: ");
		int numero2 = sc.nextInt();
		sc.close();
		int numero_menor;
		int numero_mayor;
		if (numero1 < numero2){
			numero_menor= numero1;
			numero_mayor= numero2;
		}else{
			numero_menor= numero2;
			numero_mayor= numero1;
		}
		if (numero1 == numero2){
			System.out.println("Los dos numeros son iguales");
		}else{
			for (int i=numero_menor;i<=numero_mayor;i++){
				System.out.printf("Numero = %d%n",i);
			}
		}
		System.out.printf("La media de los numeros %d y %d es: %.2f%n",numero1,numero2,calcularValorMedio(numero1,numero2));
	}
}

