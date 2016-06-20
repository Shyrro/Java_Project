package bibagenda;
import java.util.*;


public abstract class Service {

	//Attributes
	private String nom;
	
	private Map<String,Employe> employes;
	private List<Tache> taches;
	
	
	//Constructor
	public Service(String nom, Map<String,Employe> employes){
		this.nom = nom;
		this.employes = employes;
	}
	
	public Service(String nom) {
		this.nom=nom;
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
	private List<Creneau> getAllEdt(){
		
		List<Creneau> creneaux = new ArrayList<Creneau>();
		
		for(Map.Entry<String, Employe> entry : this.employes.entrySet()){
			Employe e = entry.getValue();
			creneaux.addAll(e.getEdt());
		}
		
		return creneaux;
		
	}
	
	public void supprimerTache(Tache t){
		
		List<Creneau> creneaux = new ArrayList<Creneau>();
		
		//Recuperation de tous les creneaux
		creneaux = this.getAllEdt(this.employes);
		
		//On met a null tous les creneaux occupes par la tache t
		for(Creneau c : creneaux){
			if(c.getTache().equals(t))
				c.setTache(null);
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

	public void setEmployes(Map<String, Employe> employes) {
		this.employes = employes;
	}
	
}
