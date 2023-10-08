package main;

public class main {
	
	public static void addLetter(int rand, StringBuilder str) {
        //représente 9 et A, Z et a
        if (rand < 58 || rand > 64 && rand < 91 || rand > 96) {
        	char letter = (char) rand;
        	str.append(letter);
        }
	}

	public static void main(String[] args) {
		//originellement un générateur de pseudonyme
	    StringBuilder str = new StringBuilder();
		int max = 48;
		int min = 122;
		int range = max - min + 1;
		int rand;
	    char letter;
		//26 lettres, majuscules + minuscules + nombres, en ASCII sans les caractères spéciaux
        String majuscule;
        int taille;
        int nb;
        String fix;
        //triangle rectangle
        String trect;
        
        System.out.println("Combien d'URL ?");
        nb = Clavier.lireInt();
        
        //taille aléatoire par défaut
        System.out.println("Taille fixée ? y");
        fix = Clavier.lireString();
        
        System.out.println("Quelle taille d'URL (maximum si taille aléatoire) ?");
        taille = Clavier.lireInt();
        
        System.out.println("Majuscule obligatoire pour commencer ? y");
        majuscule = Clavier.lireString();
        
        System.out.println("Pas de triangle rectangle ? y");
        trect = Clavier.lireString();
        	
        for (int i = 0 ; i < nb ; i++) {
        	if (!trect.equals("y")) {
        		taille--;
        	}
        	if (majuscule.equals("y")) {
        		max = 90;
        		min = 65;
        		taille--;
            	range = max - min + 1;
            	rand = (int)((Math.random() * range) + min);
            	letter = (char) rand;
            	str.append(letter);
            }
        	max = 48;
        	min = 122;
        	range = max - min + 1;
	        for (int j = 0; j < taille; j++) {
	        	rand = (int)((Math.random() * range) + min);
	        	addLetter(rand, str);
	        }
        	if (fix.equals("y")) {
        		while (str.length() < taille) {
        			rand = (int)((Math.random() * range) + min);
        			addLetter(rand, str);
        		}
        	}
	        System.out.println(str);
	        //reset pour futurs pseudos
            str.setLength(0);
        }
        System.out.println(str);
	}
}