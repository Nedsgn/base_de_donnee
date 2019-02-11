package fr.nedjma.basededonnees.gardien.buisness;

import java.util.ArrayList;

import fr.nedjma.basededonnees.gardien.bean.GardienBean;

public interface IGardienBuisness {
	//creation d'un tableau GardienBean que l'on instancie à la classGardienBean
public ArrayList<GardienBean> getGardienBean();
}
