package entretien;
import bibagenda.Tache;


public class TacheEntretien extends Tache {

	//attributs 
	private String numSalle;
	
	//Constructor
		public TacheEntretien(String nature, int duree, String numSalle, String idTache){
			this.natureIntervention=nature;
			this.nbCreneaux=duree;
			this.numSalle = numSalle;
			this.idTache=idTache;
		}
	
	//methodes
	public String getNumSalle() {
		return numSalle;
	}

	public void setNumSalle(String numSalle) {
		this.numSalle = numSalle;
	}
	
}
