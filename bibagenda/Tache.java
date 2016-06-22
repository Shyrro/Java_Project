package bibagenda;
import java.util.*;
import java.security.SecureRandom;
import java.math.BigInteger;

public class Tache {

		//attributs
		protected String natureIntervention;
		protected int nbCreneaux;
		protected String idTache;
	

		public Tache(String nature, int duree){
			this.natureIntervention=nature;
			this.nbCreneaux=duree;
			SecureRandom random = new SecureRandom();
			String idTemp = new BigInteger(45, random).toString(32);
			
			this.idTache= idTemp;	
		}

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
		public String toString() {
			return (idTache + " " +natureIntervention + " duree =" + nbCreneaux);
		}
		public boolean equals(Tache t){
			
			if(((this!=null)||(t!=null)) && this.natureIntervention.equals(t.natureIntervention) && this.nbCreneaux == t.nbCreneaux && this.idTache.equals(t.idTache))
				return true;
			
			return false;
		}
		
}
