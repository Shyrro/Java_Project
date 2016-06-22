package si;

import bibagenda.*;


public class TacheMateriel extends TacheInformatique {

	private Materiel materiel;

	public TacheMateriel(String nature, int duree,Materiel materiel){
		super(nature,duree);
		this.materiel = materiel;
	}

	public Materiel getMateriel(){
		return this.materiel;
	}

	public String toString(){
		return "TacheNum :"+this.idTache + " ,NatureIntervention: "+this.natureIntervention+", Materiel :"+this.materiel;
	}
}
