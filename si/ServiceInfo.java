package si;
import java.util.ArrayList;
import java.util.Map;

import bibagenda.*;


public class ServiceInfo extends Service {

		//Attributs
		ArrayList<Materiel> materiels;
		ArrayList<Logiciel> logiciels;
		private ArrayList<TacheMateriel> tachesEnAttente;

		//Constructeur
		public ServiceInfo(String nom){
			super(nom);
		}



		public ServiceInfo(String nom, Map<String, Employe> employes) {
			super(nom, employes);
			tachesEnAttente = new ArrayList<TacheMateriel>();
		}
		

		
		
		//methodes
		public ArrayList<TacheMateriel> getTachesEnAttente() {
			return tachesEnAttente;
		}

		public void setTachesEnAttente(ArrayList<TacheMateriel> tachesEnAttente) {
			this.tachesEnAttente = tachesEnAttente;
		}

		//Methodes			
		public void affecterTache(Tache t) {
			try{
				Employe e = new Employe("toto");
				e = this.getEmployeDispo(t);

				if(e!=null){
					if(t instanceof TacheLogiciel)
						for(Creneau c : e.getCreneauxLibresEmploye(t.getNbCreneaux()))
							c.setTache(t);
					else if(t instanceof TacheMateriel){
						for(Creneau c : e.getCreneauxLibresEmploye(t.getNbCreneaux()))
							c.setTache(t);
					}
				}else{
					if(t instanceof TacheMateriel)
						this.tachesEnAttente.add((TacheMateriel)t);
				}


			}catch(ClassCastException e){
			}catch(NullPointerException e){
			}
		}		
}
