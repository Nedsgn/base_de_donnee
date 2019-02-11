package fr.nedjma.basededonnees.accueil.buisness.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.nedjma.basededonnees.accueil.buisness.IAccueilBuisness;
public class AccueilBuisness implements IAccueilBuisness{
	
	@Override
	public ArrayList<String> getVilles() {
		//on crée un tableau pour récupérer tous les noms de villes et les stocker car juste avec la boucle , on les affiche c'est tout
		
		ArrayList<String> villes = new ArrayList<>();
		
		try {	//driver pour mariadb
			Class.forName("org.mariadb.jdbc.Driver");
			//le port de mariadb par défaut est sur 3306
			//le nomdomaine:3306/jee |Jee est le nom d'une database dans la bdd
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/jee", "root", "");//ici ça  génere des import
		
			
			//c'ets à partir de la connexion qu'on va créer l'objet staement que l'on crée ici parce que veut récuperer un SELECT
			//l'objet statement va exécuter des requetes via la connexion.
			
			Statement sm = cnx.createStatement();
			//ResultSet est une espece de tableau qui va contenir des éléments
			//quand on fait un SELECT on récupère un ResultSet
			ResultSet resultat = sm.executeQuery("SELECT nom FROM ville");
		//boucle while : est-ce qu'il y a un nom ? resultat.next() fait que ca passe a lelement suivant. Des qu'il a le dernier élement, il sort de la boucle
			
			
		
			while(resultat.next()) {
				String nomVille = resultat.getString("nom");//getString + le nom de la colonne, on a mi ici String parce qu'ona déclaré en varchar dans la bdd
				//IL AURAIT FALLU CREER DEUX STRING SI ON AVAIT DEUX TABLE DANS LA BDD PAR EXPLE
				villes.add(nomVille);
					
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return villes;
	}
	
	

}
