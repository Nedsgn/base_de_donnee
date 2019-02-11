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
		//on cr�e un tableau pour r�cup�rer tous les noms de villes et les stocker car juste avec la boucle , on les affiche c'est tout
		
		ArrayList<String> villes = new ArrayList<>();
		
		try {	//driver pour mariadb
			Class.forName("org.mariadb.jdbc.Driver");
			//le port de mariadb par d�faut est sur 3306
			//le nomdomaine:3306/jee |Jee est le nom d'une database dans la bdd
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/jee", "root", "");//ici �a  g�nere des import
		
			
			//c'ets � partir de la connexion qu'on va cr�er l'objet staement que l'on cr�e ici parce que veut r�cuperer un SELECT
			//l'objet statement va ex�cuter des requetes via la connexion.
			
			Statement sm = cnx.createStatement();
			//ResultSet est une espece de tableau qui va contenir des �l�ments
			//quand on fait un SELECT on r�cup�re un ResultSet
			ResultSet resultat = sm.executeQuery("SELECT nom FROM ville");
		//boucle while : est-ce qu'il y a un nom ? resultat.next() fait que ca passe a lelement suivant. Des qu'il a le dernier �lement, il sort de la boucle
			
			
		
			while(resultat.next()) {
				String nomVille = resultat.getString("nom");//getString + le nom de la colonne, on a mi ici String parce qu'ona d�clar� en varchar dans la bdd
				//IL AURAIT FALLU CREER DEUX STRING SI ON AVAIT DEUX TABLE DANS LA BDD PAR EXPLE
				villes.add(nomVille);
					
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return villes;
	}
	
	

}
