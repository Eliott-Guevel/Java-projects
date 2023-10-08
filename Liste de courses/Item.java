package courses;

import java.util.Objects;

public class Item {
	private String nom;
	//
	private String categorie;
	private double prix;
	
	public Item(String nom, String categorie, double prix) {
		super();
		this.nom = nom;
		this.categorie = categorie;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return nom + "    " + categorie + "    " + prix + " €";
	}
	
	public double getPrix() {
		return prix;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(categorie, other.categorie) && Objects.equals(nom, other.nom)
				&& Double.doubleToLongBits(prix) == Double.doubleToLongBits(other.prix);
	}
}