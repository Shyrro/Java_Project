package si;
import java.util.*;
import bibagenda.*;


public class ServiceInfo extends Service {

		//Attributs
		private ArrayList<Materiel> materiels;
		private ArrayList<Logiciel> logiciels;
		private ArrayList<TacheMateriel> tachesEnAttente;

		//Constructeur
		public ServiceInfo(String nom){
			super(nom);
			tachesEnAttente = new ArrayList<TacheMateriel>();			
		}

		public ServiceInfo(String nom, Map<String, Employe> employes) {
			super(nom, employes);
			tachesEnAttente = new ArrayList<TacheMateriel>();
		}

		
		//methodes
		public void setTachesEnAttente(TacheMateriel t){
			this.tachesEnAttente.add(t);
		}

		public ArrayList<TacheMateriel> getTachesEnAttente() {
			return tachesEnAttente;
		}
			
		public void affecterTache(Tache t) {
			try{
				Employe e = this.getEmployeDispo(t);

				if(e!=null){
						for(Creneau c : e.getCreneauxLibresEmploye(t.getNbCreneaux())) 
							c.setTache(t);
				}
				else{
					if(t instanceof TacheMateriel)
						this.tachesEnAttente.add((TacheMateriel)t);
				}


			}catch(ClassCastException e){
			}catch(NullPointerException e){
			}
		}

		public void supprimerTache(Tache t) {
		
		
			//Recuperation de tous les creneaux
			List<Creneau> creneaux = this.getAllEdt();
		
			//On met a null tous les creneaux occupes par la tache t
			for(Creneau c : creneaux){
				if(c.getTache()!=null)
				{
					if(c.getTache().equals(t))
						c.setTache(null);
				}
			}
			// on va rechercher si on peut remplacer cette tache par une des taches en attente
			Iterator<TacheMateriel> iterator = this.tachesEnAttente.iterator();
			
			boolean remplacee=false;
			while( iterator.hasNext() && remplacee==false) {
				TacheMateriel tm=iterator.next();
				if(this.getEmployeDispo(tm)!=null) {
					affecterTache(tm);
					remplacee=true;
					this.tachesEnAttente.remove(tm);
				}
			}
		
		}
				
}
