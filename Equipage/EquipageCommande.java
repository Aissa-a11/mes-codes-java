package Equipage;

import Marin.Capitaine;

public class EquipageCommande extends Equipage {

	private Capitaine commandant;

	public Capitaine getCommandant() {
		return commandant;
	}

	public void setCommandant(Capitaine commandant) {
		this.commandant = commandant;
	}

	public EquipageCommande(Capitaine c) {
		super();
		this.commandant=c;
		//this.addMarin(c);
	
	}
	
	public String toString() {
		return super.toString() + " avec comme chef: " + this.commandant.toString() ;
	}

}
