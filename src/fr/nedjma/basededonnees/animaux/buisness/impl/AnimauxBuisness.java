package fr.nedjma.basededonnees.animaux.buisness.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.nedjma.basededonnees.animaux.bean.Animal;
import fr.nedjma.basededonnees.animaux.buisness.IAnimauxBuisness;

public class AnimauxBuisness implements IAnimauxBuisness {

	@Override
	public ArrayList<String> getAnimaux() {
		//on créée un tableau de chaine de caractere qu'on nomme pour stocker les valeurs de table animaux qui se trouve dans la bdd
	ArrayList<String> nomDesAnimauxRecupDeLaBaseDeDonnees = new ArrayList<>();
		
		try {	//driver pour mariadb
			Class.forName("org.mariadb.jdbc.Driver");
			//le port de mariadb par défaut est sur 3306
			//le nomdomaine:3306/jee |Jee est le nom d'une database dans la bdd
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/jee", "root", "");//ici ça  génere des import
		
			
			//c'ets à partir de la connexion qu'on va créer l'objet staement que l'on crée ici parce que veut récuperer un SELECT
			//l'objet statement va exécuter des requetes via la connexion.
			
			Statement st = cnx.createStatement();
			//ResultSet est une espece de tableau qui va contenir des éléments
			//quand on fait un SELECT on récupère un ResultSet
			ResultSet resultat = st.executeQuery("SELECT nom FROM animaux");
		//boucle while : est-ce qu'il y a un nom ? resultat.next() fait que ca passe a lelement suivant. Des qu'il a le dernier élement, il sort de la boucle
			
			
		
			while(resultat.next()) {
				String nomAnimaux = resultat.getString("nom");//getString + le nom de la colonne, on a mi ici String parce qu'ona déclaré en varchar dans la bdd
				//IL AURAIT FALLU CREER DEUX STRING SI ON AVAIT DEUX TABLE DANS LA BDD PAR EXPLE
				nomDesAnimauxRecupDeLaBaseDeDonnees.add(nomAnimaux);
				//.add fait que ça rajoute au tableau les données	
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return nomDesAnimauxRecupDeLaBaseDeDonnees;//renvoie le tableau
	}

	
	@Override
	public ArrayList<String> getTypesAnimaux() {
ArrayList<String> typeDesAnimaux = new ArrayList<>();

try {	//driver pour mariadb
	Class.forName("org.mariadb.jdbc.Driver");
	//le port de mariadb par défaut est sur 3306
	//le nomdomaine:3306/jee |Jee est le nom d'une database dans la bdd
	Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/zoo", "root", "");//ici ça  génere des import

	
	//c'ets à partir de la connexion qu'on va créer l'objet staement que l'on crée ici parce que veut récuperer un SELECT
	//l'objet statement va exécuter des requetes via la connexion.
	
	Statement st = cnx.createStatement();
	//ResultSet est une espece de tableau qui va contenir des éléments
	//quand on fait un SELECT on récupère un ResultSet
	ResultSet resultat = st.executeQuery("SELECT type FROM animaux");
//boucle while : est-ce qu'il y a un nom ? resultat.next() fait que ca passe a lelement suivant. Des qu'il a le dernier élement, il sort de la boucle
	
	

	while(resultat.next()) {
		String typeAnimaux = resultat.getString("type");//getString + le nom de la colonne, on a mi ici String parce qu'ona déclaré en varchar dans la bdd
		//IL AURAIT FALLU CREER DEUX STRING SI ON AVAIT DEUX TABLE DANS LA BDD PAR EXPLE
		typeDesAnimaux.add(typeAnimaux);
		//.add fait que ça rajoute au tableau les données	
	}
	
	
} catch (Exception e) {
	
	e.printStackTrace();
}

return typeDesAnimaux;
	}


	@Override
	public ArrayList<Integer> getVieAnimaux() {
		ArrayList<Integer> esperanceVieDesAnimauxRecupDeLaBD = new ArrayList<>();//ce tableau qu'on crée est vide, ici il est stocké dans la variable : esperanceVieDesAnimauxRecupDeLaBD. Ensuite avec les .add on y ajoute des éléments
		try {
			// Charger le driver
			Class.forName("org.mariadb.jdbc.Driver");
			// je me  connecte
			Connection cnx = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/zoo", "root", "");
			Statement st = cnx.createStatement();
			ResultSet resultat = 
					st.executeQuery("SELECT esperance_vie FROM animaux");
			
			while (resultat.next()) {
				int vieAnimal = resultat.getInt("esperance_vie");
				esperanceVieDesAnimauxRecupDeLaBD.add(vieAnimal);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return esperanceVieDesAnimauxRecupDeLaBD;
	}


	@Override
	public ArrayList<Integer> getPoidsAnimaux() {
		ArrayList<Integer> poidsDesAnimauxRecupDeLaBD = new ArrayList<>();
		
		try {
			// Charger le driver
			Class.forName("org.mariadb.jdbc.Driver");
			// je me  connecte
			Connection cnx = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/zoo", "root", "");
			Statement st = cnx.createStatement();
			ResultSet resultat = 
					st.executeQuery("SELECT poids FROM animaux");
			
			while (resultat.next()) {
				int poidsAnimal = resultat.getInt("poids");
				poidsDesAnimauxRecupDeLaBD.add(poidsAnimal);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return poidsDesAnimauxRecupDeLaBD;
	}


	@Override
	public ArrayList<Animal> getAnimal() {//nom de la methode
		ArrayList<Animal> listeDesAnimaux = new ArrayList<>();//creation d'un tableau
		
		
		
		try {
		Class.forName("org.mariadb.jdbc.Driver");
		// je me  connecte
		Connection cnx = DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/zoo", "root", "");
		Statement st = cnx.createStatement();
		ResultSet resultat = 
				st.executeQuery("SELECT nom, type, esperance_vie, poids FROM animaux");
		
		while (resultat.next()) {//.next : tant qu'il y a un element la dessus , je le prends et je l'injecte
			//on charge ici les nom des colonnes de la bdd
			String nomAnimal = resultat.getString("nom");
			String typeAnimal = resultat.getString("type");
			int vieAnimal = resultat.getInt("esperance_vie");
			int poidsAnimal = resultat.getInt("poids");
			
			//on construit un objet Animal "an" qui provient du bean Animal.java qui récupère les données des colonnes de la bdd
			Animal an = new Animal(nomAnimal, typeAnimal, vieAnimal, poidsAnimal);
			
			//et j'ajoute cet objet au tableau
			listeDesAnimaux.add(an);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
		
		return listeDesAnimaux;//je retourne le tableau qui était initialement vide et que j'ai construit
	}

}
