package Equipage;

import java.util.ArrayList;
import java.util.List;
import Marin.Marin;


public class Equipage {

	private List<Marin>marins;


	public Equipage() {
		marins=new ArrayList<Marin>();
	}

	public List<Marin> getEquipage(){
		List<Marin>copiDeMarin=new ArrayList<Marin>();
		for (Marin m : marins) 
			copiDeMarin.add(m);
		return copiDeMarin;
	}

	public  int getNombreMarins() {
		return marins.size();
	}

	public boolean AddMarin(Marin marin) {
		boolean found = false;
		for(Marin A : marins) {
			if(A.equals(marin)) found=true;							
		}
		if(!found) {marins.add(marin);return true;}		

		else 
			return false ;	
	}

	public boolean isMarinPresent(Marin m) {
		boolean trouver = false;
		for (Marin B : marins ) {
			if (B.equals(m))trouver = true;
		}
		if (!trouver) return false;
		else return false;

	}

	public boolean AddMarin2(Marin m) {
		if(this.isMarinPresent(m))return false;
		else {
			marins.add(m);
			return true;
		}

	}		

	@Override
	public String toString() {

		String EQUIPAGE;
		EQUIPAGE="equipage";
		for (Marin m : marins) {
			EQUIPAGE=EQUIPAGE+m.toString();
		}
		return EQUIPAGE;
	}

	public boolean removeMarin(Marin m) {		

		if(!this.isMarinPresent(m))return false;
		else {
			marins.remove(m);
			return true;			
		}
	}

	public void clear() {
		marins.clear();

	}

	public boolean addAllEquipage(Equipage e) {
		for (Marin m : e.getEquipage()) {
			if (this.isMarinPresent(m)) return false;	
		}
		
		for (Marin m : e.getEquipage()) {
			this.AddMarin(m);
		}
		e.clear();
	    return true;	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marins == null) ? 0 : marins.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipage other = (Equipage) obj;
		if (marins == null) {
			if (other.marins != null)
				return false;
		} else if (!marins.equals(other.marins))
			return false;
		return true;
	}
	
	
	
	





}
