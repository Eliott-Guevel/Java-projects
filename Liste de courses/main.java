package courses;

import java.util.ArrayList;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		int totalChoice;
		double total = 0;
		int length;
		int random;
		int listeCoursesSize;
		Item randomItem;
		Item lastItem;
		double prix;
		//double costly;
		ArrayList<Item> randomList = new ArrayList<Item>();
		ArrayList<Item> listeCourses = new ArrayList<Item>();
		Random rand;
		
		//boisson, fruits, c�r�ales, l�gumes, viande, sucr�, extras
		Item boisson1 = new Item("Boisson1", "Boisson", 1.15);
		Item boisson2 = new Item("Boisson2", "Boisson", 0.87);
		
		Item fruit1 = new Item("Fruit1", "Fruit", 1.75);
		Item fruit2 = new Item("Fruit2", "Fruit", 1.75);
		
		Item cereales1 = new Item("C�r�ales1", "C�r�ales", 1.35);
		Item cereales2 = new Item("C�r�ales2", "C�r�ales", 1.49);
		
		Item legume1 = new Item("L�gume1", "L�gume", 0.99);
		Item legume2 = new Item("L�gume2", "L�gume", 0.94);
		
		Item viande1 = new Item("Viande1", "Viande", 2.81);
		Item viande2 = new Item("Viande2", "Viande", 2.28);
		
		Item sucre1 = new Item("Sucr�1", "Sucr�", 3.64);
		Item sucre2 = new Item("Sucr�2", "Sucr�", 2.39);
		
		Item extra1 = new Item("Extra1", "Extra", 3.10);
		Item extra2 = new Item("Extra2", "Extra", 2.30);
		
		randomList.add(boisson1);
		randomList.add(boisson2);
		randomList.add(fruit1);
		randomList.add(fruit2);
		randomList.add(cereales1);
		randomList.add(cereales2);
		randomList.add(legume1);
		randomList.add(legume2);
		randomList.add(viande1);
		randomList.add(viande2);
		randomList.add(sucre1);
		randomList.add(sucre2);
		randomList.add(extra1);
		randomList.add(extra2);
		
		length = randomList.size();

		/*item le plus cher
		costly = randomList.get(0).getPrix();
		for (int i = 0 ; i < length ; i++) {
			randomItem = randomList.get(i);
			if (randomItem.getPrix() > costly) {
				costly = randomItem.getPrix();
			}
		}*/
		
		rand = new Random();
		
		System.out.println("Quel montant le total doit-il viser ?");
		totalChoice = Clavier.lireInt();
		
		//minimum en euros
		while (total < totalChoice) {
			random = rand.nextInt(length);
			randomItem = randomList.get(random);
			listeCourses.add(randomItem);
			
			prix = randomItem.getPrix();
			total += prix;
			
			//condition pour que quand un item particulier est choisi, un autre est ajout� � la liste
			if (randomItem.equals(viande1) && viande1.getPrix() < total) {
				listeCourses.add(legume1);
				total += legume1.getPrix();
			}
		}
		
		listeCoursesSize = listeCourses.size() - 1;
		
		//renvoie �l�ment dans console si d�passe total d�fini
		if (total > totalChoice) {
			lastItem = listeCourses.get(listeCoursesSize);
			listeCourses.remove(lastItem);
			total -= lastItem.getPrix();
			System.out.println("Ce produit d�passait le total d�fini :");
			System.out.println(lastItem);
		}
		
		//total = Math.round(total);
		
		System.out.println("");
		System.out.println("Prix total : " + total + " euros, " + listeCoursesSize + " articles");
		for (int t = 0 ; t < listeCoursesSize ; t++) {
			System.out.println(listeCourses.get(t));
		}
	}
}