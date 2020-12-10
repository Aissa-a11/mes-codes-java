package Marin;

public class MainMarin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Marin m1= new Marin("AIMENE","Youcef",3000);
		Marin m2= new Marin ("AIMENE","Youcef",3000);
		Marin m3= new Marin ("JSK","kabyle",2000);
		boolean c=(m1==m2);
		
		
		System.out.println(c);
		
		System.out.println(m1);
		
		System.out.println(m2);
		
		System.out.println(m3);
		
		m1.augmenteSalaire(1000);System.out.println(m1);
		
		m2.augmenteSalaire(1000);System.out.println(m2);
		
		m3.augmenteSalaire(1000);System.out.println(m3);
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(m3.equals(m2));
		
		/*m1.affiche();
		m2.affiche();
		m3.affiche();
		
		m1.augmenteSalaire(1000);
		m1.affiche();
		m2.augmenteSalaire(1000);
		m2.affiche();
		m3.augmenteSalaire(1000);
		m3.affiche();*/
		
		/*if (m1==m2) {
			System.out.println(true);
		}
			else {
				System.out.println(false);
		
			}*/
	}

}
