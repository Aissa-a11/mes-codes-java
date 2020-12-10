package Marin;

import Equipage.Equipage;

public class CapitaineMain {

	public static void main(String[] args) {
		Capitaine cap = new Capitaine ("guillaume","musso",1000,"capitaine");
	System.out.println(cap.toString());
	
	Equipage e = new Equipage();
	int nb = e.getNombreMarins();       

	System.out.println("Nb marins="+nb);
	
	Marin m;
	m=new Marin("tom","jerry",1000);
	
	e.AddMarin(m);
	nb = e.getNombreMarins();
	System.out.println("Nb marins="+nb);
	
	if(e.AddMarin(m) == false) System.out.println("Eror! "+m+ " existe deja");
	nb = e.getNombreMarins(); 
	System.out.println("Nb marins="+nb);
	
	Marin m2=new Marin("Maatoub","lounes",1500);
	e.AddMarin(m2);
	System.out.println(e.toString());
	e.removeMarin(m);
	System.out.println(e.toString());
	if (e.removeMarin(m)) System.out.println("OK");
	else System.out.println("pas OK");
	
	System.out.println(e.getEquipage());
	e.clear();
	System.out.println(e.toString());
	
	int t[]={44,77,4,-9};
	
	for (int valeur : t) System.out.print(valeur+" ");
	
	System.out.println();
	
	Marin m3=new Marin("spartacus","kryksus",1400);
	Marin m4=new Marin("annibal","barca",1600);
	Equipage e1 = new Equipage();
	Equipage e2 = new Equipage();
	e1.AddMarin(m); e1.AddMarin(m2);
	System.out.println(e1.toString());
	e2.AddMarin(m3); e2.AddMarin(m4);
	System.out.println(e2.toString());
	e1.addAllEquipage(e2);
	
	System.out.println(e1.toString());
	System.out.println(e2.toString());
	
	

	

	}

}
