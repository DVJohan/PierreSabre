package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	public Humain(String boisson, String nom, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public String getBoisson() {
		return boisson;
	}
	private void direBonjour() {
		System.out.println(Bonjour ! Je m’appelle  et j’aime boire du ...);
		
	}
	private void boire() {
		System.out.println(Mmmm, un bon verre de .... ! GLOUPS !);
		
	}
	
	


}
