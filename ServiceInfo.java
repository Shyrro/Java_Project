package si;
import java.util.ArrayList;
import java.util.Map;

import bibagenda.Employe;
import bibagenda.Service;
import bibagenda.Tache;


public class ServiceInfo extends Service {

		//Attributs
		ArrayList<Materiel> materiels;
		ArrayList<Logiciel> logiciels;
									
		//attributs
		private ArrayList<TacheMateriel> tachesEnAttente;

		//Constructeur
		public ServiceInfo(String nom, Map<String, Employe> employes) {
			super(nom, employes);
			tachesEnAttente = new ArrayList<TacheMateriel>();
		}
		

		
		
		//methodes
		public ArrayList<TacheEntretien> getTachesEnAttente() {
			return tachesEnAttente;
		}

		public void setTachesEnAttente(ArrayList<TacheMateriel> tachesEnAttente) {
			this.tachesEnAttente = tachesEnAttente;
		}

		//Methodes			
		public void affecterTache(TacheInformatique t) throws ClassCastException, NullPointerException {
			try{
				Employe e = this.getEmployeDispo();

				if(e!=null){
					if(t instanceof TacheLogiciel)
						for(Creneau c : e.getCreneauxLibresEmp())
							c.setTache(t);
					else if(t instanceof TacheMateriel){
						for(Creneau c : e.getCreneauxLibresEmp())
							c.setTache(t);
					}
				}else{
					if(t instanceof TacheMateriel)
						this.tachesEnAttente.add(t);
				}


			}catch(ClassCastException e){
				throw e;
			}catch(NullPointerException e){
				throw e;
			}
		}		
}
