package Marin;

import java.util.Arrays;

public class MarinUtil {


	public static void AugmenteSalaire(Marin[] marins, int augmentation) {


		for(Marin m : marins) {

			m.augmenteSalaire(augmentation);
		}	
		
	}

	public static  int getMaxsalaire(Marin[] marins) {

		int maxsalaire=0;

		for(Marin m : marins) {

			if(m.getsalaire() > maxsalaire) {
				maxsalaire=m.getsalaire();
			}
		}
		return maxsalaire;
	}

	public static int getMoyenneSalaire(Marin[] marins) {
		int somme =0;
		for(Marin m : marins) {
			somme=somme+m.getsalaire();
		}
		return (int) (somme/marins.length);
	}
	
		public static  int getMedianeSalaire(Marin[] marins) {
			int[] salaires = new int[marins.length] ;
			for (int i = 0 ; i < marins.length ; i++) {
				salaires[i] = marins[i].getsalaire() ;
			}
			Arrays.sort(salaires) ;
			return salaires[salaires.length/2];
		}
		
		
		
	


}

