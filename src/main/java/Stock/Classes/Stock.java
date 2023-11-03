package Stock.Classes;

import java.util.ArrayList;
import java.util.List;

public class Stock {
private static List<Produit> produits;
public static void initialiserStock() {
	 produits=new ArrayList<Produit>();
	 produits.add(new Produit(401, "MacBook Pro", "Informatique", "Apple", "Ordinateur portable haut de gamme avec des performances exceptionnelles.", "image1.jpg", 10, 2299.99));
	 produits.add(new Produit(402, "MacBook Air", "Informatique", "Apple", "Ordinateur portable léger et puissant avec un écran Retina.", "image2.jpg", 15, 1299.99));
	 produits.add(new Produit(403, "HP Spectre x360", "Informatique", "HP", "Ordinateur portable convertible élégant avec un écran tactile et une grande autonomie.", "image3.jpg", 12, 1599.99));

	 produits.add(new Produit(501, "AirPods Pro", "Multimedia", "Apple", "Écouteurs sans fil avec suppression active du bruit.", "image4.jpg", 30, 249.99));
	 
	 produits.add(new Produit(601, "Adidas Ultraboost", "Sport", "Adidas", "Chaussures de course avec un excellent amorti.", "image5.jpg", 20, 159.99));
	 produits.add(new Produit(602,"Adidas Training Pants", "Sport", "Adidas","Pantalons de sport confortables et respirants pour l'entraînement.", "image6.jpg", 25, 49.99));
	 
	 produits.add(new Produit(701, "Montre-bracelet en acier inoxydable", "Mode", "Fossil", "", "image7.jpg", 40, 179.99));
	 produits.add(new Produit(702,"Montre-bracelet en cuir", "Mode", "Michael Kors","", "image8.jpg", 30, 199.99));
}

public static List<Produit> getStock() {
    return produits;
}
}
