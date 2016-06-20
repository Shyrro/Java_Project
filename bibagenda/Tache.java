package bibagenda;

public class Tache {

		//attributs
		protected String natureIntervention;
		protected int nbCreneaux;
		protected String idTache;
	
		// methodes
		
		public String getNatureIntervention() {
			return natureIntervention;
		}
		public void setNatureIntervention(String natureIntervention) {
			this.natureIntervention = natureIntervention;
		}
		public int getNbCreneaux() {
			return nbCreneaux;
		}
		public void setNbCreneaux(int nbCreneaux) {
			this.nbCreneaux = nbCreneaux;
		}
		public String getIdTache() {
			return idTache;
		}
		public void setIdTache(String idTache) {
			this.idTache = idTache;
		}
		
		public boolean equals(Tache t){
			
			if(this.natureIntervention.equals(t.natureIntervention) && this.nbCreneaux == t.nbCreneaux && this.idTache.equals(t.idTache))
				return true;
			
			return false;
		}
		
}
