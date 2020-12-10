package bateau;

import Equipage.EquipageCommande;

public class BateauMotor extends Bateau implements IPropulsion {
	
	public BateauMotor(String nom, int tonnage, EquipageCommande eCommandant) {
		super(nom, tonnage, eCommandant);
	}

	public String getPropulsion(){
		return "motor";
	}

}
