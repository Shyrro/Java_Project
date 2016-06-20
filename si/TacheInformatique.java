package si;

import bibagenda.Tache;

public class TacheInformatique extends Tache {
	
	//Constructor
	public TacheInformatique(String nature, int duree){
		this.natureIntervention=nature;
		this.nbCreneaux=duree;
		SecureRandom random = new SecureRandom();
		String idTemp = new BigInteger(45, random).toString(32);
		
		//On boucle pour verifier si l'id qu'on genere aleatoirement 
		//n est pas deja attribue a un employe du service
		while(s.employeExistsInService(idTemp)){
			idTemp = new BigInteger(45, random).toString(32);
		}
		
		this.idTache = idTemp;

}
