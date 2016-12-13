import java.util.Scanner;
public class Ejercicio2{
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		sc.close();
		System.out.println("La frase es: "+frase);
		System.out.println("La longitud de la frase(contando los espacion en blanco) es: "+ frase.length());
		int contador_z=0;
		int contador_c=0;
		int palabras = 1;
		for (int i=0;i<frase.length();i++){
			if (frase.charAt(i) == 'z'){
				contador_z++;
			}
			if (frase.charAt(i) == 'c'){
				contador_c++;
			}
			if (frase.charAt(i) == 'Z'){
				contador_z++;
			}
			if (frase.charAt(i) == 'C'){
				contador_c++;
			}
			if (frase.charAt(i) == ' '){
				palabras++;
			}
		}
		
		System.out.println("El numero de 'z' en la frase es: "+ contador_z);
		System.out.println("El numero de 'c' en la frase es: "+ contador_c);
		System.out.println("El numero de palabras en la frase es: "+ palabras);
		System.out.println("La frase en mayusculas es: "+ frase.toUpperCase());
		System.out.println("La frase en minuscula y concadenada es: "+ frase.toLowerCase());
		
	}
}

