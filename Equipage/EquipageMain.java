package Equipage;

import java.util.Scanner;

import Marin.Marin;

public class EquipageMain {

	public static void main(String[] args) {
		
		Marin m = new Marin ("Maatoub","Lounes",1000) ;
		Marin m1= new Marin ("Maatoub","Lounes",1000) ;
		Equipage E= new Equipage();
		
		int nbrDeMarin = E.getNombreMarins();
		System.out.println("nombre de marins est "+nbrDeMarin);
		
	E.AddMarin(m);
		nbrDeMarin = E.getNombreMarins();
		System.out.println("le nouveau nombre de marins est "+nbrDeMarin);

		E.AddMarin(m1);
		nbrDeMarin = E.getNombreMarins();
		System.out.println("le nouveau nombre de marins est "+nbrDeMarin);
		
		/*if(E.AddMarin(m1) == false) System.out.println("ERREUR! "+m1+ " existe deja");
		nbrDeMarin = E.getNombreMarins(); 
		System.out.println("Nb marins="+nbrDeMarin);*/
		
		Marin m2 = new Marin ("Slimane","Azem",2000);
		E.AddMarin(m2);
		nbrDeMarin = E.getNombreMarins();
		System.out.println(E.toString());
		
		E.removeMarin(m2);
		System.out.println(E.toString());
		if (E.removeMarin(m2)) System.out.println("OK");
		else System.out.println("KO");
		
		E.clear();
		
		System.out.println(E.getNombreMarins());
		
		Marin m3=new Marin("ALI","AISSA",1400);
		Marin m4=new Marin("Annibal","Barcka",1600);
		Equipage E1 = new Equipage();
		Equipage E2 = new Equipage();
		E1.AddMarin(m); E1.AddMarin(m1);
		System.out.println(E1.toString());
		E2.AddMarin(m2); E2.AddMarin(m3);
		System.out.println(E2.toString());
		E1.addAllEquipage(E2);
		
		System.out.println(E1.toString());
		System.out.println(E2.toString());

		Scanner Sc= new Scanner(System.in);
		
	}

}
