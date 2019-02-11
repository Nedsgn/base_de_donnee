package fr.nedjma.basededonnees.gardien.bean;

public class GardienBean {
private String nom;
private String prenom;
private int numero;
private int age;
private String urlImage;
public GardienBean() {
	super();
	// TODO Auto-generated constructor stub
}
public GardienBean(String nom, String prenom, int numero, int age, String urlImage) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.numero = numero;
	this.age = age;
	this.urlImage = urlImage;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getUrlImage() {
	return urlImage;
}
public void setUrlImage(String urlImage) {
	this.urlImage = urlImage;
}



}
