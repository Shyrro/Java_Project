package entretien; 
import java.util.*;

import bibagenda.*;

public class ServiceEntretien extends Service {

		//constructeurs
		public ServiceEntretien(String nom, Map<String, Employe> employes) {
			super(nom, employes);
		}

		public ServiceEntretien(String nom) {
			super(nom);
		}



		public void affecterTache(Tache t){
			try{
				Employe e = this.getEmployeDispo(t);
				for(Creneau c : e.getCreneauxLibresEmploye(t.getNbCreneaux()))
					c.setTache(t);

			}catch(NullPointerException e){
			}
			
		}		
		
		
}
