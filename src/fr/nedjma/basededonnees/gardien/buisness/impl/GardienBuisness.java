package fr.nedjma.basededonnees.gardien.buisness.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.nedjma.basededonnees.gardien.bean.GardienBean;
import fr.nedjma.basededonnees.gardien.buisness.IGardienBuisness;

public class GardienBuisness implements IGardienBuisness{

	@Override
	public ArrayList<GardienBean> getGardienBean() {
		
		ArrayList<GardienBean> recupDonneesGardiens= new ArrayList<>();
		
		try {	
			Class.forName("org.mariadb.jdbc.Driver");
			
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/zoo", "root", "");
			
			Statement st = cnx.createStatement();
			
			ResultSet resultat = st.executeQuery("SELECT nom, prenom, numero, age, urlImage FROM Gardien");
			
			while(resultat.next()) {
				String nomGardiens = resultat.getString("nom");
				String prenomGardiens = resultat.getString("prenom");
				int numeroGardiens = resultat.getInt("numero");
				int ageGardiens = resultat.getInt("age");
				String urlGardiens = resultat.getString("urlImage");
				
				GardienBean gard = new GardienBean(nomGardiens, prenomGardiens, numeroGardiens, ageGardiens, urlGardiens);
				
				recupDonneesGardiens.add(gard);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();//s'il y a une execption, je l'écris
		}
		
		return recupDonneesGardiens;
	}

}
