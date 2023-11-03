package Stock.Classes;

public class Produit {
private int id,quantite;
private String libelle,categorie,marque,description,image;
private double prix;

public Produit(int id, String libelle, String categorie, String marque, String description, String image, int quantite, double prix) {
    this.id = id;
    this.libelle = libelle;
    this.categorie = categorie;
    this.marque = marque;
    this.description = description;
    this.image = image;
    this.quantite = quantite;
    this.prix = prix;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public String getCategorie() {
	return categorie;
}
public void setCategorie(String categorie) {
	this.categorie = categorie;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getDescription() {
	return description;
}
public void setDesc(String desc) {
	this.description = desc;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}

}
