package personnage;
import asteroide.*;
import asteroide.console.*;
public class PetitPrince implements Sujet{
	private String nom;
	private int argent;
	private ConsoleJavaBoy console;
	private int cpt;
	
	public PetitPrince(String nom) {
		this.cpt=0;
		this.nom = nom;
		this.argent = 0;
		this.console = new ConsoleJavaBoy(this);
	}
	
	public String getNom() {
		return this.nom;
		
	}
    
	public int getArgent() {
		return this.argent;
		
	}
    
	public void run() {
		String s ="J'ai fait "+this.cpt+" tours \n";
		console.parler(s);
		console.seDirigerVers(0);
		cpt++;
	}
}
