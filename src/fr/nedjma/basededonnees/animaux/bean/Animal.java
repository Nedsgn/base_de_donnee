package fr.nedjma.basededonnees.animaux.bean;

public class Animal {
	private String nom;
	private String type;
	private  int esperance_vie;
	private int poids;
	
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String nom, String type, int esperance_vie, int poids) {
		super();
		this.nom = nom;
		this.type = type;
		this.esperance_vie = esperance_vie;
		this.poids = poids;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getEsperance_vie() {
		return esperance_vie;
	}
	public void setEsperance_vie(int esperance_vie) {
		this.esperance_vie = esperance_vie;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	

}
