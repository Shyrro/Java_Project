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
		
		this.idEmp = idTemp;
		this.creneaux = new ArrayList<Creneau>();	
		this.initEdt();

	}
	
	public Employe(String nom,Service s){
		
		this.s=s;
		this.nom = nom;
		SecureRandom random = new SecureRandom();
		String idTemp = new BigInteger(45, random).toString(32);
		
		this.idEmp = idTemp;
		this.creneaux = new ArrayList<Creneau>();	
		this.initEdt();
	}
	
	//Methods
	
    public List<Creneau> getCreneauxLibresEmploye(int nbCreneaux) {
        
        List<Creneau> edt = this.creneaux;
        List<Creneau> res = new ArrayList<Creneau>();

        boolean creneauxFound = false;
        int countCreneauxCons = 1;
        Iterator<Creneau> iter = edt.iterator();
        Creneau c = iter.next();

        while(!c.isLibre())
		    c=iter.next();

		    res.add(c);

		    while(iter.hasNext() && !creneauxFound){
		        c=iter.next();
		        if(c.getTache()==null) {
		            
		            if(c.getJour().equals(res.get(res.size()-1).getJour())) {
				        res.add(c);
				        countCreneauxCons++;
		                if(countCreneauxCons==nbCreneaux)
		                    creneauxFound=true;
		            }
		            else {
		                res=new ArrayList<Creneau> ();
		                res.add(c);
		                countCreneauxCons=1;
		            }
		        }
        }
        System.out.println("\n\n\n ");


        if(!creneauxFound)
            res=null;

        return res;

    }

   
     private void initEdt () {

     	int compt = 0;
     	Jour j = Jour.Lundi;
        int i=0;
     	while(i<40){
     		switch(j){
     			case Lundi :
     				if(compt<8){
     					Creneau c = new Creneau(j,compt);
     					this.creneaux.add(c);
     					compt++;
                        i++;
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
                        i++;
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
                        i++;
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
                        i++;
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
                        i++;
     				}
     			break;
     			default :
     				//TODO : Create Exception for  this case
     			break;
     		}
     		
     	}
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
	public Service getS() {
		return s;
	}
	
}
