package Marin;

public class Capitaine extends Marin {

	private String grade;
		
	public Capitaine(String nom,String prenom,int salaire,String grade) {
		super(nom,prenom,salaire);
		this.grade=grade;
	}
	
	public String toString() {
		 return super.toString()+","+this.grade ;
	}

	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		
		if ((o instanceof Capitaine) == false)
			return false ;
		
		Capitaine cap ;
		cap=(Capitaine)o;
		if (!(this.grade).equals(cap.grade)) return false;

		return true;
	}

	public int hashCode() {
		int result = super.hashCode();
		return result + this.grade.hashCode() ;
	} 

}
