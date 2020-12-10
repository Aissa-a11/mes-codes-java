package bateau;

import Equipage.EquipageCommande;

public class BateauVoile extends Bateau implements IPropulsion {

	public BateauVoile(String nom, int tonnage, EquipageCommande eCommandant) {
		super(nom, tonnage, eCommandant);
	}

	public String getPropulsion(){
		return "voiles";
	}

}
