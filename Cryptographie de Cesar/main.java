package main;

public class main {
	
	//-1 pour obtenir vraie phrase
    static String phrase = "dpnnt csplfo, nz mpwf dbo sfnpuf gjy, ufmm uifn pvs dpef DBU";
    static String[] splits = phrase.split("\\s+");
	
	public static void Letter(char character, StringBuilder str, int nbchar, String mode) {
		int integer;
		
		//boucle pour l'alphabet
		integer = (int) character;
		if (mode.equals("+")) {
			integer += nbchar;
		}
		else {
			integer -= nbchar;
		}
		
		//code ASCII A = 65, code ASCII Z = 90, code ASCII a = 97, code ASCII z = 122
		if (integer > 90 && integer < 97 || integer > 122) {
			integer -= 26;
			character = (char) integer;
		}
		else if (Character.isLetter(character)) {
			character = (char) integer;
		}
		//ajoute tous caractères
		str.append(character);
	}

	public static void main(String[] args) {
		//ajout encodage
		//choisir nombre de lettres
	    StringBuilder str = new StringBuilder();
	    char letter;
        int length;
        int nbchar;
        String mode;
        
        System.out.println("Mode ?");
        mode = Clavier.lireString();
        
        System.out.println("Nombre de lettres de décalage ?");
        nbchar = Clavier.lireInt();
        
        //nombre de sous-strings
        length = splits.length;
        
        for (int i = 0; i < length; i++) {
	        for (int j = 0; j < splits[i].length(); j++){
	        	letter = splits[i].charAt(j);
	        	Letter(letter, str, nbchar, mode);
	        }
	        //espaces entre mots
	        str.append(' ');
        }

	    System.out.println(str);
	}
}