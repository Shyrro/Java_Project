package bibagenda;

import java.util.*;
import java.security.SecureRandom;
import java.math.BigInteger;

public class Employe {

	//Attributes
	private String idEmp;
	private String nom;
	private List<Creneau> creneaux;
	private Service s;
	
	//Constructor
	public Employe(String nom) {
		this.nom=nom;
		SecureRandom random = new SecureRandom();
		String idTemp = new BigInteger(45, random).toString(32);
		
		//On boucle pour verifier si l'id qu'on genere aleatoirement 
		//n est pas deja attribue a un employe du service
		idTemp = new BigInteger(45, random).toString(32);
		
		
		this.idEmp = idTemp;
		this.creneaux = new ArrayList<Creneau>();	
		this.initEdt();

	}
	
	public Employe(String nom,Service s){
		
		this.setS(s);
		this.nom = nom;
		SecureRandom random = new SecureRandom();
		String idTemp = new BigInteger(45, random).toString(32);
		
		//On boucle pour verifier si l'id qu'on genere aleatoirement 
		//n est pas deja attribue a un employe du service
		while(s.employeExistsInService(idTemp)){
			idTemp = new BigInteger(45, random).toString(32);
		}
		
		this.idEmp = idTemp;
		this.creneaux = new ArrayList<Creneau>();	
		this.initEdt();
	}
	
	//Methods
	
    public List<Creneau> getCreneauxLibresEmploye(int nbCreneaux) {
                List<Creneau> liste = new ArrayList<Creneau> ();
                Iterator<Creneau> iterCren = this.creneaux.iterator();
                
                while (iterCren.hasNext() && liste.size() != nbCreneaux) {
                		Creneau c = iterCren.next();
                        Jour day=c.getJour();
                        if (day!=liste.get(liste.size()-1).getJour()){
                                liste=new ArrayList<Creneau> ();
                        } else {
                            if (iterCren.next().getTache()==null)
                            	liste.add(c);
                        }
                        
                }
                
                if (liste.size()!=nbCreneaux)
                        liste=null;

                return liste;
                        
     }

     private void initEdt () {

     	int compt = 0;
     	Jour j = Jour.Lundi;

     	//40 est le nombre de créneaux total par semaine
     	//Chaque jour contient 8 créneaux, donc 8*5 = 40 ( je suis fort en maths !!!!)
     	for(int i=0;i<40;i++){
     		switch(j){
     			case Lundi :
     				if(compt<8){
     					Creneau c = new Creneau(j,compt);
     					this.creneaux.add(c);
     					compt++;
     				}else{
     					compt=0;
     					j = Jour.Mardi;
     				}
     			break;
     			case Mardi :
     				if(compt<8){
     					Creneau c = new Creneau(j,compt);
     					this.creneaux.add(c);
     					compt++;
     				}else{
     					compt=0;
     					j = Jour.Mercredi;
     				}
     			break;
     			case Mercredi :
     				if(compt<8){
     					Creneau c = new Creneau(j,compt);
     					this.creneaux.add(c);
     					compt++;
     				}else{
     					compt=0;
     					j = Jour.Jeudi;
     				}
     			break;
     			case Jeudi :
     				if(compt<8){
     					Creneau c = new Creneau(j,compt);
     					this.creneaux.add(c);
     					compt++;
     				}else{
     					compt=0;
     					j = Jour.Vendredi;
     				}
     			break;
     			case Vendredi :
     				if(compt<8){
     					Creneau c = new Creneau(j,compt);
     					this.creneaux.add(c);
     					compt++;
     				}
     			break;
     			default :
     				//TODO : Create Exception for  this case
     			break;
     		}
     		
     	}
     }
		
		
	public List<Creneau> getCreneauEmp(){
		//TODO
		return new ArrayList<Creneau>();
	}
	public List<Creneau> getEdt(){		
		return this.creneaux;		
	}
	public String toString(){
		return idEmp + " " + nom;
	}
	//Getters & setters
	public String getIdEmp() {
		return idEmp;
	}
	public void setIdEmp(String idEmp) {
		this.idEmp = idEmp;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Creneau> getCreneaux() {
		return creneaux;
	}
	public void setCreneaux(List<Creneau> creneaux) {
		this.creneaux = creneaux;
	}
	public Service getS() {
		return s;
	}
	public void setS(Service s) {
		this.s = s;
	}
	
	
}
