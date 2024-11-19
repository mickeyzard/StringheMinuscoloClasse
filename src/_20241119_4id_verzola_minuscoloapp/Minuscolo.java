package _20241119_4ID_Verzola_MinuscoloApp;

import java.util.Scanner;

public class Minuscolo {
	
	static final int TANTI = 30;
	private String parola;
	//stringa come array
	char[] minuscolo = new char[TANTI];
	
	// //legge la stringa
	public void inputUser() {

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una parola: ");
		parola = input.next();
		input.close();

	}
	
	//trasforma la stringa letta in un array di caratteri
	public void lowerCase() {
		for (int x = 0; x < parola.length(); x++) {
			minuscolo[x] = parola.charAt(x);
		}

		// trasforma la parola in minuscolo
		for (int x = 0; x < parola.length(); x++) {
			minuscolo[x] = Character.toLowerCase(minuscolo[x]); // in minuscolo
			System.out.println("La parola in minuscolo (array): " + minuscolo[x]);

		}
	}

	public void printLowerCase() {
		// visualizza la parola carattere per carattere
		for (int x = 0; x < parola.length(); x++) {
			System.out.print(minuscolo[x]);
		}
		//stampa in forma oggetto della Stringa
		System.out.println(" ");
		String parolaMinu = new String(minuscolo);
		System.out.println("La parola in minuscolo (oggetto):");
		
		//trim() taglia tutti gli spazi vuoti presenti in una stringa
		System.out.println(parolaMinu.trim());
	}
}
