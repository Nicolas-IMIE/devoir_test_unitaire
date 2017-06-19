package main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		TemplateBanner template = new TemplateBanner();
		
		System.out.println("Le template selectionne est le template Banner (7*8)");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez entrer les lettres que vous souhaitez utiliser (parmis l'alphabet latin - tout attaché) : ");
		String alpha = sc.nextLine();
		alpha = alpha.toUpperCase();
		
		String[] splitAlpha = alpha.split("(?!^)");
		
		
		System.out.println("Veuillez entrez les caractères à transformer : ");
		String str = sc.nextLine();
		
		sc.close();
		
		System.out.println("Voici vos caractères transformés : ");
		
		System.out.println(template.asciiArt(str.toUpperCase(), splitAlpha));
		
		
		
		

	}

}
