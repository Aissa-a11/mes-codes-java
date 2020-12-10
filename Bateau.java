package bateau;

import Equipage.EquipageCommande;

public class Bateau implements IPropulsion {

	private String nom;
	private int tonnage;
	private EquipageCommande eCommandant;
	
	public Bateau(String nom, int tonnage, EquipageCommande eCommandant){
		this.nom = nom;
		this.tonnage = tonnage;
		this.eCommandant = eCommandant;
	}

	public String getNom() {
		return nom;
	}

	public int getTonnage() {
		return tonnage;
	}

	public EquipageCommande geteCommandant() {
		return eCommandant;
	}

	public void seteCommandant(EquipageCommande eCommandant) {
		this.eCommandant = eCommandant;
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Bateau))
			return false;
		Bateau bateau = (Bateau) o;
		return nom.equals(bateau.nom);
	}
	
	public String toString() {
		return "Bateau [nom=" + nom + ", tonnage=" + tonnage +
				", nom du Capitaine=" + eCommandant.getCommandant().getnom() +
				", membres de l' quipage=" + eCommandant.getEquipage() + "]";
	}

	@Override
	public String getPropulsion() {
		// TODO Auto-generated method stub
		return null;
	}

}
