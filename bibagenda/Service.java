package bibagenda;
import java.util.*;


public abstract class Service {

	//Attributes
	protected String nom;
	protected Map<String,Employe> employes;
	protected List<Tache> taches;
	
	
	//Constructor
	public Service(String nom, Map<String,Employe> employes){
		this.nom = nom;
		this.employes = employes;
	}
	
	public Service(String nom) {
		this.nom=nom;
		this.employes = new HashMap<String,Employe>();
	}
	
	//methodes
	public void ajoutEmploye(Employe emp){
		
		this.employes.put(emp.getIdEmp(),emp);
		
	}
	
	public abstract void affecterTache(Tache t);		
	
	public boolean employeExistsInService(String idEmp){
		
		int i=0;
		boolean trouve = false;
		while(i<this.employes.size() && !trouve){
			if(this.employes.get(i).getIdEmp().equals(idEmp))
				trouve = true;			
			i++;
		}
		
		return trouve;
		
	}
	
	//Returns all schedules 
	public List<Creneau> getAllEdt(){
		
		List<Creneau> creneaux = new ArrayList<Creneau>();
		
		for(Map.Entry<String, Employe> entry : this.employes.entrySet()){
			Employe e = entry.getValue();
			creneaux.addAll(e.getEdt());
		}
		
		return creneaux;
		
	}

	public Employe getEmployeDispo(Tache t){
		Iterator<Employe> iterator = this.employes.values().iterator();
		Employe e=null;

		while(iterator.hasNext() && e==null) {
			Employe e1=iterator.next();
			if(e1.getCreneauxLibresEmploye(t.getNbCreneaux())!=null)
				e=e1;
		}
		//verifier dans la liste des employes le premier pour lequel 
		//la fonction getCreneauxLibresEmploye est non nulle.

		//on retourne cet employe
		return e;
	}
	
	public void supprimerTache(Tache t){
		
		List<Creneau> creneaux = new ArrayList<Creneau>();
		Tache tacheNull=null;
		
		//Recuperation de tous les creneaux
		creneaux = this.getAllEdt();
		
		//On met a null tous les creneaux occupes par la tache t
		for(Creneau c : creneaux){
			if(c.getTache()!=null){
				if(c.getTache().equals(t))
					c.setTache(tacheNull);
			}
			
		}
		
	}
	
	//Getters and Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Map<String, Employe> getEmployes() {
		return employes;
	}	
	
}
