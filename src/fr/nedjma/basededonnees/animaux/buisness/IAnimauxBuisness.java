package fr.nedjma.basededonnees.animaux.buisness;

import java.util.ArrayList;

import fr.nedjma.basededonnees.animaux.bean.Animal;

public interface IAnimauxBuisness {
	//on d�clare les m�thodes ( fonctionnalit�s qui vont nous renvoiyer un r�sultat)
	public ArrayList<String>getAnimaux();
	public ArrayList<String>getTypesAnimaux();
	public ArrayList<Integer>getVieAnimaux();
	public ArrayList<Integer>getPoidsAnimaux();
	public ArrayList<Animal>getAnimal();

}
