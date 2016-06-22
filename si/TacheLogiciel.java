package si;

import bibagenda.*;


public class TacheLogiciel extends TacheInformatique {
	
	private Logiciel logiciel;

	public TacheLogiciel(String nature, int duree,Logiciel logiciel){
		super(nature,duree);
		this.logiciel = logiciel;
	}

	public Logiciel getLogiciel(){
		return this.logiciel;
	}

	public String toString(){
		return "TachNum : "+this.idTache + " ,NatureIntervention: "+this.natureIntervention+", Logiciel :"+this.logiciel;
	}

}
