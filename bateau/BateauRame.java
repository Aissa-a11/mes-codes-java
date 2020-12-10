package bateau;

import Equipage.EquipageCommande;

public class BateauRame extends Bateau implements IPropulsion {
	
	public BateauRame(String nom, int tonnage, EquipageCommande eCommandant) {
		super(nom, tonnage, eCommandant);
	}

	public String getPropulsion(){
		return "rames";
	}


}
