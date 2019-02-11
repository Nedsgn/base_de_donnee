package fr.nedjma.basededonnees.animaux.buisness;

import java.util.ArrayList;

import fr.nedjma.basededonnees.animaux.bean.Animal;

public interface IAnimauxBuisness {
	//on déclare les méthodes ( fonctionnalités qui vont nous renvoiyer un résultat)
	public ArrayList<String>getAnimaux();
	public ArrayList<String>getTypesAnimaux();
	public ArrayList<Integer>getVieAnimaux();
	public ArrayList<Integer>getPoidsAnimaux();
	public ArrayList<Animal>getAnimal();

}
