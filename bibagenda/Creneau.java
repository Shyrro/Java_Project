package bibagenda;
public class Creneau {

	private int ordreCreneau;
	private int heureDebut;
	private int heureFin;
	private Jour jour;
	private Tache tache;
	
	public Creneau(Jour jour, int ordreCreneau){
		this.jour = jour;
		this.ordreCreneau = ordreCreneau;
		this.tache = null;
	}
	
	public boolean isLibre(){
		boolean libre = false;
		
		return libre;		
	}
		
	//Getters & Setters
	public int getOrdreCreneau() {
		return ordreCreneau;
	}
	public void setOrdreCreneau(int ordreCreneau) {
		this.ordreCreneau = ordreCreneau;
	}
	public int getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(int heureDebut) {
		this.heureDebut = heureDebut;
	}
	public int getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(int heureFin) {
		this.heureFin = heureFin;
	}
	public Jour getJour() {
		return jour;
	}
	public void setJour(Jour jour) {
		this.jour = jour;
	}

	public Tache getTache() {
		return tache;
	}

	public void setTache(Tache tache) {
		this.tache = tache;
	}
	
}
