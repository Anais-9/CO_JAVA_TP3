package personnage;
import asteroide.*;
import asteroide.console.*;
public class PetitPrince0 implements Sujet{
	private String nom;
	private int argent;
	private ConsoleJavaBoy console;
	private int cpt;
	
	public PetitPrince0() {
		this.cpt=0;
		this.nom = "Default";
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
