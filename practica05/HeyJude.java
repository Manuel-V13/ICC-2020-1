/**
	* Programa para imprimir una cancion
	* Objetivo Practicar el uso de las estructuras de control mas basicas (if y while).
	* Jose Manuel Martinez Peralta
	* 03-09-2019*/

public class HeyJude {

	public static void main(String[] args) {
		String HEJE  = "Hey Jude";
		String DOT = ",don´t ";		
		String MAKIBAD = "make it bad";
		String TAKE = "Take a sad song and make it better"; 
		String BEID = "be afraid";
		String YOUW = "you where made to go out and get her";
		String LEMDWN = "let me down";
		String YOUH = "You have found her, now go and get her";
		String REMTO = "Remember to ";
		String LETHINYH = "let her into you heart";
		String LETHUYS = "let her under your skin";
		String THEYU = "Then you ";
		String CNS = "can start ";
		String BEGN = "begin ";
		String TOMAIBE = "to make it better";
		String NA = "na ";
		String BETTER = "better ";
		String OH = ", oh";
		String BLANCO = " ";
		int parrafo = 0;
		int d = 0;
		int l = 0;
		while(parrafo < 7){
//Primer parrafo
	    	if (parrafo == 0 || parrafo == 1 || parrafo == 3 || parrafo == 5) {
			System.out.print(HEJE);
	    	}
	    	if (parrafo == 0 || parrafo == 1 || parrafo == 3 || parrafo == 5) {
			System.out.print(DOT);
	    	}
	    	if (parrafo == 0 || parrafo == 5) {
			System.out.println(MAKIBAD);
	    	}
	    	if (parrafo == 1) {
			System.out.println(BEID);
	    	}
	    	if (parrafo == 3) {
			System.out.println(LEMDWN);
	    	}
//Segundo parrafo
		    if (parrafo == 0 || parrafo == 5) {
			System.out.println(TAKE);
	    	}
	    	if (parrafo == 1) {
			System.out.println(YOUW);
		    }
	    	if (parrafo == 3) {
			System.out.println(YOUH);
		    }
//Tercer parrafo
	    	if (parrafo == 0 || parrafo == 1 || parrafo == 3 || parrafo == 5) {
			System.out.print(REMTO);
	    	}
	    	if (parrafo == 0 || parrafo == 3) {
			System.out.println(LETHINYH);
	    	}
		    if (parrafo == 1 || parrafo == 5) {
			System.out.println(LETHUYS);
	    	}
//Cuarto parrafo
		    if (parrafo == 0 || parrafo == 1 || parrafo == 3 || parrafo == 5) {
			System.out.print(THEYU);
		    }
	    	if (parrafo == 0 || parrafo == 3) {
			System.out.print(CNS);
	    	}
	    	if (parrafo == 1 || parrafo == 5) {
			System.out.print(BEGN);
		    }	
	    	if (parrafo == 0 || parrafo == 1 || parrafo == 3 || parrafo == 5) {
			System.out.println(TOMAIBE);
	    	}
//Na
	    	while ((parrafo == 2 || parrafo == 4) && d < 11) {
			System.out.print(NA);
			d ++;
	    	}
	    	if (parrafo == 2 || parrafo == 4) {
			System.out.println();
			d = 0;
	    	}
	    	while (parrafo == 6 && d < 10) {
			System.out.print(NA);
			d ++;
	    	}
	    	if (parrafo == 6) {
			System.out.print(NA);
			System.out.println(HEJE);
	    	}
//Quinto Parrafo
	    	while (parrafo == 5 && l < 6) {
			System.out.print(BETTER);
			l++;
	    	}	
	    	if (parrafo == 5) {
			System.out.println(OH);
	    	}
	    
	    	System.out.println();
	    	parrafo ++;
			

		}	
		
	}
}