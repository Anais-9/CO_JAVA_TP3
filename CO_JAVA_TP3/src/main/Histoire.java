package main;
import personnage.PetitPrince0;
import asteroide.serveur.*;
public class Histoire {
	public static void main(String[] agr) {
		PetitPrince0 petit1 = new PetitPrince0();
		PetitPrince0 petit2 = new PetitPrince0();
		
		try {
			String [] s = {};
			asteroide.serveur.Asteroide325Server.main(s);
			petit1.run();
			petit2.run();
		}
		catch (Exception e) {
			System.out.println("ERREUR SERVEUR : " + e);
		}
		
	}

}
