package birthdays;

public class Date {
	private static final int ANNEE_MIN = 0;
	
	private int jour;
	private int mois;
	private int annee;
	
	public Date(int jour, int mois, int annee) throws DateException {
		if (annee < ANNEE_MIN) {
			//System.err.println("Erreur : année inférieure au seuil de " + ANNEE_MIN);
			//System.exit(1);
			throw new DateException("année incorrecte");
		}
		this.annee = annee;
		
		if (mois < 0 || mois > 12) {
			//System.err.println("Erreur : mois incorrect");
			//System.exit(1);
			throw new DateException("mois incorrect");
		}
		this.mois = mois;
		
		if (jour < 0 || jour > nbJoursMois(mois, annee)) {
			//System.err.println("Erreur : jour incorrect");
			//System.exit(1);
			throw new DateException("jour incorrect");
		}
		this.jour = jour;
	}
	
	public void demain() {
		//int nbJours = nbJoursMois(mois, annee);
		//demainCalcul(nbJours, mois);
		if (jour == nbJoursMois(mois, annee)) {
			this.jour = 1;
			if (mois == 12) {
				mois = 1;
				annee += 1;
			}
			else {
				mois += 1;
			}
		}
		else {
			this.jour += 1;
		}
		/*//28 jours
		if (mois == 2) {
			demainCalcul(28);
		}
		//29 jours
		if (isBissextile(annee)) {
			demainCalcul(29);
		}
		//30 jours
		if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
			demainCalcul(30);
		}
		//31 jours
		if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
			demainCalcul(31);
		}*/
	}
	
	public static int nbJoursMois(int mois, int annee) {
		if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
			return 31;
		}
		else if (mois == 2) {
			if (isBissextile(annee)) {
				return 29;
			}
			else {
				return 28;
			}
		}
		else {
			return 30;
		}
	}
	
	public void demainCalcul(int jour, int mois) {
		if (this.jour < jour) {
			this.jour += 1;
		}
		else if (this.mois < mois) {
			this.jour = 1;
			mois += 1;
		}
		else {
			this.jour = 1;
			this.mois = 1;
			annee += 1;
		}
	}
	
	public static boolean isBissextile(int annee) {
		if (annee % 400 == 0) {
			return true;
		}
		if (annee % 100 == 0) {
			return false;
		}
		if (annee % 4 == 0) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		if ((jour < 10) && (mois < 10)) {
			return "0" + jour + "/" + "0" + mois + "/" + annee;
		}
		if (mois < 10) {
			return jour + "/" + "0" + mois + "/" + annee;
		}
		if (jour < 10) {
			return "0" + jour + "/" + mois + "/" + annee;
		}
		return jour + "/" + mois + "/" + annee;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public int getAnnee() {
		return annee;
	}
}