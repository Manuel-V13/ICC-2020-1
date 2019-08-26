import java.util.Scanner;
/**
	* Programa para convertir nombres y fechas en RFC
	* Objetivo Trabajar con objetos de la clase String
	* Jose Manuel Martinez Peralta
	* 22-08-2019*/

public class RFC {

// Declaracion de variables 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombreCompleto = new String ();
		String fechaNacimiento = new String ();
		
//Variable nombre
		System.out.println("Introduce tu nombre completo: ");
		nombreCompleto = scanner.nextLine() ;
		
//Variable fecha
		System.out.println("Introduce tus fecha de nacimiento en formato dd/mm/aaaa:");
		fechaNacimiento = scanner.nextLine();
		
//Convertidor
        char nombre = nombreCompleto.charAt(0);
        int apellidoPaterno = nombreCompleto.lastIndexOf(" ");
        String num2 = nombreCompleto.substring (apellidoPaterno + 1 , apellidoPaterno + 3);
        int apellidoMaterno = nombreCompleto.lastIndexOf (" ");
        String num2Mayuscula = num2.toUpperCase();
        char num3 = nombreCompleto.charAt(apellidoMaterno + 1);
       	String dia = fechaNacimiento.substring(0,2);
        String mes = fechaNacimiento.substring(3,5);
        String año = fechaNacimiento.substring(8,10);

		System.out.println("El RFC de " + nombreCompleto + " es:" + num2Mayuscula + num3 + nombre + año + mes + dia);




	}

}