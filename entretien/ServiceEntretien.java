package entretien; 
import java.util.ArrayList;
import java.util.Map;

import bibagenda.Employe;
import bibagenda.Service;
import bibagenda.Tache;

public class ServiceEntretien extends Service {

		public ServiceEntretien(String nom, Map<String, Employe> employes) {
			super(nom, employes);
		// TODO Auto-generated constructor stub
		}


		public void affecterTache(TacheEntretien t) throws NullPointerException{
			try{
				
				Employe e = this.getEmployeDispo();

				for(Creneau c : e.getCreneauxLibresEmp())
					c.setTache(t);

			}catch(NullPointerException e){
				throw e;
			}
			
		};		
		
		
}
