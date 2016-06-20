package entretien;
import bibagenda.Tache;


public class TacheEntretien extends Tache {

	//attributs 
	private String numSalle;
	
	//Constructor
		public TacheEntretien(String nature, int duree, String numSalle){
			super(nature,duree);
			this.numSalle = numSalle;
		}
	
	//methodes
	public String getNumSalle() {
		return numSalle;
	}

	public void setNumSalle(String numSalle) {
		this.numSalle = numSalle;
	}
	
}
