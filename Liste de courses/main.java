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
		
		//boisson, fruits, céréales, légumes, viande, sucré, extras
		Item boisson1 = new Item("Boisson1", "Boisson", 1.15);
		Item boisson2 = new Item("Boisson2", "Boisson", 0.87);
		
		Item fruit1 = new Item("Fruit1", "Fruit", 1.75);
		Item fruit2 = new Item("Fruit2", "Fruit", 1.75);
		
		Item cereales1 = new Item("Céréales1", "Céréales", 1.35);
		Item cereales2 = new Item("Céréales2", "Céréales", 1.49);
		
		Item legume1 = new Item("Légume1", "Légume", 0.99);
		Item legume2 = new Item("Légume2", "Légume", 0.94);
		
		Item viande1 = new Item("Viande1", "Viande", 2.81);
		Item viande2 = new Item("Viande2", "Viande", 2.28);
		
		Item sucre1 = new Item("Sucré1", "Sucré", 3.64);
		Item sucre2 = new Item("Sucré2", "Sucré", 2.39);
		
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
			
			//condition pour que quand un item particulier est choisi, un autre est ajouté à la liste
			if (randomItem.equals(viande1) && viande1.getPrix() < total) {
				listeCourses.add(legume1);
				total += legume1.getPrix();
			}
		}
		
		listeCoursesSize = listeCourses.size() - 1;
		
		//renvoie élément dans console si dépasse total défini
		if (total > totalChoice) {
			lastItem = listeCourses.get(listeCoursesSize);
			listeCourses.remove(lastItem);
			total -= lastItem.getPrix();
			System.out.println("Ce produit dépassait le total défini :");
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