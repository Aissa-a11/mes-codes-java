package Marin;

public class MainMarinUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marin[] marins=new Marin[5];

		marins[0]=new Marin("Aimene","Youcef",1000);
		marins[1]=new Marin("Aimene1","Youcef1",2000);
		marins[2]=new Marin("Aimene2","Youcef2",3000);
		marins[3]=new Marin("Aimene3","Youcef3",4000);
		marins[4]=new Marin("Aimene4","Youcef4",5000);


		for (Marin m:marins) {
			System.out.println(m);
		}

		MarinUtil.AugmenteSalaire(marins,100);
		for(Marin m : marins) {
			System.out.println(m);
		}

		MarinUtil.getMaxsalaire(marins);			
		System.out.println("le salaire max est de "+MarinUtil.getMaxsalaire(marins));


		MarinUtil.getMoyenneSalaire(marins);
		System.out.println("le salaire moyen est de "+MarinUtil.getMoyenneSalaire(marins));

		MarinUtil.getMedianeSalaire(marins);
		System.out.println("la mediaine est  "+MarinUtil.getMoyenneSalaire(marins));

	}
}
