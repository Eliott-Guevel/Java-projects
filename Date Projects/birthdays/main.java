package birthdays;

import java.util.ArrayList;

import news.Date;

public class main {

	public static void main(String[] args) throws DateException, news.DateException {
		int annee;
		
		int jourToday;
		int moisToday;
		int anneeToday;
		
		DatePersonne currentBirthday;
		int compteurJour;
		Date nbMoisAnnee;
		int i;
		
		i = 0;
		compteurJour = 0;
		nbMoisAnnee = new Date(0, 0, 0);
		
		//Date dateToday = new Date(, , );
		System.out.println("Date d'aujourd'hui ? jour/mois/année");
		jourToday = Clavier.lireInt();
		moisToday = Clavier.lireInt();
		anneeToday = Clavier.lireInt();
		DatePersonne dateToday = new DatePersonne(jourToday, moisToday, anneeToday, " ");
		
		DatePersonne date1 = new DatePersonne(28, 2, anneeToday, "Personne");
		DatePersonne date2 = new DatePersonne(22, 9, anneeToday, "Personne2");
		DatePersonne date3 = new DatePersonne(15, 12, anneeToday, "Personne3");
		DatePersonne date4 = new DatePersonne(27, 1, anneeToday, "Personne4");
		
		DatePersonne date5 = new DatePersonne(17, 7, anneeToday, "Personne5");
		DatePersonne date6 = new DatePersonne(15, 1, anneeToday, "Personne6");
		DatePersonne date7 = new DatePersonne(10, 8, anneeToday, "Personne7");
		DatePersonne date8 = new DatePersonne(12, 1, anneeToday, "Personne8");
		DatePersonne date9 = new DatePersonne(27, 1, anneeToday, "Personne9");
		DatePersonne date10 = new DatePersonne(6, 9, anneeToday, "Personne10");
		DatePersonne date11 = new DatePersonne(21, 3, anneeToday, "Personne11");
		DatePersonne date12 = new DatePersonne(21, 11, anneeToday, "Personne12");
		
		ArrayList<DatePersonne> listeDate = new ArrayList<DatePersonne>();
		listeDate.add(date1);
		listeDate.add(date2);
		listeDate.add(date3);
		listeDate.add(date4);
		listeDate.add(date5);
		listeDate.add(date6);
		listeDate.add(date7);
		listeDate.add(date8);
		listeDate.add(date9);
		listeDate.add(date10);
		listeDate.add(date11);
		listeDate.add(date12);
		
		currentBirthday = listeDate.get(0);
		while (dateToday.getJour() != currentBirthday.getJour()
					  || dateToday.getMois() != currentBirthday.getMois()
					  || dateToday.getAnnee() != currentBirthday.getAnnee()) {
			currentBirthday = listeDate.get(i);
			i++;
			if (i > listeDate.size() - 1) {
				dateToday.demain();
				compteurJour++;
				nbMoisAnnee.demain();
				i = 0;
			}
		}
		
		System.out.print("Le prochain anniversaire est " + currentBirthday);
		System.out.print(", et est dans " + compteurJour + " jours");
		if (nbMoisAnnee.getMois() > 0) {
			System.out.print(", soit " + nbMoisAnnee.getMois() + " mois et " + nbMoisAnnee.getJour() + " jours");
		}
		else {
			;
		}
	}
}