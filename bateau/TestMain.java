package bateau;

import java.util.ArrayList;

import Equipage.EquipageCommande;
import Marin.Capitaine;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Capitaine commandant = new Capitaine("TOTO","TITI",2000, "CAPITAINE");
		EquipageCommande eCommande = new EquipageCommande(commandant);
		
		Bateau bateau = new Bateau("Bateau1", 100, eCommande);
		
		System.out.println(bateau.toString());
		
		BateauMotor bm = new BateauMotor("BateauMoteur", 1000, eCommande);
		BateauVoile bv = new BateauVoile("BateauVoile", 1000, eCommande);
		BateauRame br = new BateauRame("BateauRames", 1000, eCommande);
		System.out.println(bm.getPropulsion());
		
		ArrayList<Bateau> listeBateaux = new ArrayList<Bateau>();
		listeBateaux.add(bm);
		listeBateaux.add(bv);
		listeBateaux.add(br);
		for (Bateau b : listeBateaux) {
			System.out.println(b.getPropulsion());
		}
		

	}

}
