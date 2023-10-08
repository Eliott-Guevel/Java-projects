package RGB_et_pourcentage_RGB;

public class main {

	public static void main(String[] args) {
		String typeconversion;
		double rgb;
		double rgb2;
		double rgb3;
		String pourcentage = "";
		
		// bleu
		//0.35	
		//0.80	
		//0.98
		// rose
		//0.96	
		//0.66
		//0.72
		// blanc
		//1.0
		//1.0
		//1.0
		
//		rouge
//		0.89
//		0.47
//		0.34
//		bleu ciel
//		0.35
//		0.53
//		0.59
//		bleu marine
//		0.21
//		0.15
//		0.28
		
		//violet
		//0.60
		//0.23
		//0.66
		//rose
		//0.95
		//0.63
		//0.72
		//rouge
		//0.78
		//0.13
		//0.43
		
//		bleu
//		0.47
//		0.60
//		0.32
//		blanc
//		0.93
//		0.92
//		0.87
//		blond
//		0.98
//		0.84
//		0.64
		
		//gris
//		0.40
//		0.41
//		0.35
//		bleu
//		0.05
//		0.47
//		0.65
		//peau
//		0.69
//		0.54
//		0.38
		
		//rose
//		0.96
//		0.78
//		0.75
		//noir
//		0.07
//		0.05
//		0.04
		//blanc
		
		System.out.println("Première valeur RGB ?");
		rgb = Clavier.lireInt();
		System.out.println("Deuxième valeur RGB ?");
		rgb2 = Clavier.lireInt();
		System.out.println("Troisième valeur RGB ?");
		rgb3 = Clavier.lireInt();
		System.out.println("Type de conversion ?");
		typeconversion = Clavier.lireString();
		
		//RGB vers pourcentage
		if (typeconversion.equals("p")) {
			pourcentage = "pourcentage";
			rgb = rgb * 100 / 255;
			rgb2 = rgb2 * 100 / 255;
			rgb3 = rgb3 * 100 / 255;
		}
		//RGB vers pourcentun
		else if (typeconversion.equals("p1")) {
			pourcentage = "pourcentun";
			rgb = rgb / 255;
			rgb2 = rgb2  / 255;
			rgb3 = rgb3 / 255;
		}
		//pourcentage vers RGB
		else {
			rgb = (int) (rgb * 255 / 100);
			rgb2 = (int) (rgb2 * 255 / 100);
			rgb3 = (int) (rgb3 * 255 / 100);
		}
		
		System.out.println("Première valeur " + pourcentage + " RGB " + rgb);
		System.out.println("Deuxième valeur " + pourcentage + " RGB " + rgb2);
		System.out.println("Troisième valeur " + pourcentage + " RGB " + rgb3);
	}
}