package si;
import java.util.Date;

public class Logiciel {
	
	// attributs
	private String nom;
	private String numVersion;
	private String tailleMemoire;
	private String dateObtention;
	private String nomEditeur;
	
	//constructeur
	public Logiciel(String nom, String numVersion, String tailleMemoire, String dateObtention, String nomEditeur) {
		this.nom=nom;
		this.numVersion=numVersion;
		this.tailleMemoire=tailleMemoire;
		this.dateObtention=dateObtention;
		this.nomEditeur=nomEditeur;
	}
	
	
	// methodes
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNumVersion() {
		return numVersion;
	}
	public void setNumVersion(String numVersion) {
		this.numVersion = numVersion;
	}
	public String getTailleMemoire() {
		return tailleMemoire;
	}
	public void setTailleMemoire(String tailleMemoire) {
		this.tailleMemoire = tailleMemoire;
	}
	public String getDateObtention() {
		return dateObtention;
	}
	public void setDateObtention(String dateObtention) {
		this.dateObtention = dateObtention;
	}
	public String getNomEditeur() {
		return nomEditeur;
	}
	public void setNomEditeur(String nomEditeur) {
		this.nomEditeur = nomEditeur;
	}
	public String toString(){
		return "Nom: "+nom +" NumV : "+numVersion;
	}
}
