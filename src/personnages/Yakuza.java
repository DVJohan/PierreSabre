package personnages;


public class Yakuza extends Humain {
	
	private String clan;
	private int reputation=0;
	
	public Yakuza(String nom, String boissonfavorite, int nbargent, String clan) {
		super(nom, boissonfavorite, nbargent);
		this.clan = clan;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan);
	}
	
	public int getReputation() {
		return reputation;
	}
	
	
	public void extorquer(Commercant victime) {
		int nbargentextorquer=victime.seFaireExtorquer();
		gagnerArgent(nbargentextorquer);
		reputation += 1; 
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom() +", si tu tiens � la vie donne moi ta bourse !");
		parler("J�ai piqu� les "+ nbargentextorquer +" sous de "+ victime.getNom() +", ce qui me fait "+getNbargent()+" sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		reputation -= 1;
		parler("J�ai perdu mon duel et mes "+ getNbargent() + " sous, snif... J'ai d�shonor� le clan de"+ clan);
		perdreArgent(getNbargent());
		return getNbargent();
	}
	
	public void gagner(int gain) {
		 parler(" Ce ronin pensait vraiment battre " + getNom() + " du clan de "+ clan
		 		+ " Je l'ai d�pouill� de ses " + gain);
		 gagnerArgent(gain);
		 reputation += 1;
	}

	
}