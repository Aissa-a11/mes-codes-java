package Marin;

public class Marin {

	private String nom;
	private String prenom;
	private int salaire;


	public Marin(String nom,String prenom,int salaire) {
		this.nom=nom;
		this.prenom=prenom;
		this.salaire=salaire;
	}
	
	

	public Marin(String nom,int salaire) {
		this.nom=nom;
		this.salaire=salaire;
		prenom="";
	}
	
	
	public void setnom(String name) {
		nom=name;
	}
	
	public String getnom() {
		return nom;
	}
	
	public void setprenom(String p) {
		prenom=p;
	}
	
	public String getprenom() {
		return prenom;
	}
	
	public void setsalaire(int s) {
		salaire=s;
	}
	
	public int getsalaire() {
		return salaire;
	}
	
	
	@Override
	public String toString() {
		return "Marin [nom= " + getnom() + ", prenom= " + getprenom()+ ", salaire= " + getsalaire() + "]";
	}

	/*public void affiche() {
		System.out.println(getnom()+" "+getprenom()+" "+getsalaire());
	}*/
	public void augmenteSalaire(int s) {
		salaire=salaire+s;
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Marin))
			return false ; Marin marin = (Marin) obj ;return nom.equals(marin.nom) && prenom.equals(marin.prenom) && salaire==( marin.salaire );
		
	}

	
}
