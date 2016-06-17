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

		
		
		//attributs
		private ArrayList<TacheEntretien> tachesEnAttente;
		
		
		//methodes
		public ArrayList<TacheEntretien> getTachesEnAttente() {
			return tachesEnAttente;
		}

		public void setTachesEnAttente(ArrayList<TacheEntretien> tachesEnAttente) {
			this.tachesEnAttente = tachesEnAttente;
		}

		public void affecterTache(Tache t){
			List<Employe> emps = new ArrayList<Employe>();
			
			emps = addAll(this.employes);
			
			while(i<emps.size() && emps[i].getCreneauxLibres(t.getNbCreneaux)){
				
			}
			
			
		};		
		
		
}
