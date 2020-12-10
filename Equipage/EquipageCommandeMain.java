package Equipage;

import Marin.Capitaine;
import Marin.Marin;

public class EquipageCommandeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Marin m = new Marin("Marco","Polo",2700);
	      System.out.println(m.toString());
	      
	      Capitaine c = new Capitaine("Christophe","Colomb",4000,"CAPITAINE");
	      System.out.println(c.toString());
	      
	      EquipageCommande e=new EquipageCommande(c);
	      e.AddMarin(m);
	      //e.addMarin(c);
	      
	      System.out.println(e.toString());
	      
	      //EquipageCommande e1=new EquipageCommande(m); //IMPOSSIBLE
	      //e.addMarin(m);

	}

}
