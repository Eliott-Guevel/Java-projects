package news;

public class main {

	public static void main(String[] args) throws DateException {
		int jourNews;
		int moisNews;
		int anneeNews;
		
		int jourToday;
		int moisToday;
		int anneeToday;
		
		int compteurJour;
		int compteurJour2;
		Date nbMoisAnnee;
		Date nbMoisAnnee2;
		Date dateNews2;
		
		double proba;
		
		compteurJour = 0;
		compteurJour2 = 0;
		nbMoisAnnee = new Date(0, 0, 0);
		nbMoisAnnee2 = new Date(0, 0, 0);
		
		//Date dateNews = new Date(, , );
		System.out.println("Date des dernières nouvelles ? jour/mois/année");
		jourNews = Clavier.lireInt();
		moisNews = Clavier.lireInt();
		anneeNews = Clavier.lireInt();
		Date dateNews = new Date(jourNews, moisNews, anneeNews);
		dateNews2 = dateNews;
		
		//Date dateToday = new Date(, , );
		System.out.println("Date d'aujourd'hui ? jour/mois/année");
		jourToday = Clavier.lireInt();
		moisToday = Clavier.lireInt();
		anneeToday = Clavier.lireInt();
		Date dateToday = new Date(jourToday, moisToday, anneeToday);
		
		while (dateNews.getJour() != dateToday.getJour()
			  || dateNews.getMois() != dateToday.getMois()
			  || dateNews.getAnnee() != dateToday.getAnnee()) {
			dateNews.demain();
			compteurJour++;
			nbMoisAnnee.demain();
		}

		System.out.print("Cela fait " + compteurJour + " jours qu'il n'y a pas eu de nouvelles");
		if (nbMoisAnnee.getMois() > 0) {
			System.out.print(", soit " + nbMoisAnnee.getMois() + " mois et " + nbMoisAnnee.getJour() + " jours");
		}
		else {
			;
		}
		
		Date dateNouvelles = new Date(8, 10, 2023);
		
		while (dateNews2.getJour() != dateNouvelles.getJour()
			  || dateNews2.getMois() != dateNouvelles.getMois()
			  || dateNews2.getAnnee() != dateNouvelles.getAnnee()) {
			dateNews2.demain();
			compteurJour2++;
			nbMoisAnnee2.demain();
		}
		
		System.out.print("\nPlus que " + compteurJour2 + " jours au maximum !");
		if (nbMoisAnnee2.getMois() > 0) {
			System.out.print(" Soit " + nbMoisAnnee2.getMois() + " mois et " + nbMoisAnnee2.getJour() + " jours");
		}
		else {
			;
		}
		
		//puisque l'on se rapproche de la date voulue
		proba = 1.0 / (365 - compteurJour) * 100;
		System.out.println();
		System.out.println("La probabilité que des nouvelles soit disponible demain est de " + proba + "% !");
	}
}