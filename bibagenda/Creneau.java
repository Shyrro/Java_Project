package bibagenda;
public class Creneau {

	private int ordreCreneau;
	private Jour jour;
	private Tache tache;
	
	public Creneau(Jour jour, int ordreCreneau){
		this.jour = jour;
		this.ordreCreneau = ordreCreneau;
		this.tache = null;
	}
	
	public boolean isLibre(){
		boolean libre = false;
		if(this.tache==null)
			libre=true;
		
		return libre;		
	}
		
	//Getters & Setters
	public int getOrdreCreneau() {
		return ordreCreneau;
	}
	public Jour getJour() {
		return jour;
	}
	public Tache getTache() {
		return tache;
	}
	public void setTache(Tache tache) {
		this.tache = tache;
	}
	public String toString() {
		return (jour.toString() + " " + ordreCreneau + " : " + tache);
	}
	
}
