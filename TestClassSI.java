// classe de test 
import bibagenda.*;
import si.*;
import entretien.*;
import java.util.*;

public class TestClassSI {

	public static void main (String[] args) {

		ServiceInfo s = new ServiceInfo("le QG");

		Employe e1=new Employe("Sahmane");

		Employe e2=new Employe("Lavigne");


		s.ajoutEmploye(e1);

		s.ajoutEmploye(e2);

	    //affiche les employes
		System.out.println("Employes du service :\n");
		for(Map.Entry<String,Employe> e : s.getEmployes().entrySet()){
			System.out.println(e.getValue());
		}
		System.out.println("\n \n \n");



		// affiche les emplois du temps de tous les employes
		for(Map.Entry<String,Employe> e : s.getEmployes().entrySet()){
			
			System.out.println("emploi du temps de : " + e.getValue());

			for(Creneau c : e.getValue().getEdt())
				System.out.println(c);
		}

		for(int i=0;i<5;i++)
					System.out.println("\n");
		
		//creation de taches
		TacheInformatique t1=new TacheLogiciel("installation",5, new Logiciel("eclipse","LKF","123","2/5/2013","Eclipse"));
		TacheInformatique t2=new TacheMateriel("reparer ordinateur", 4, new Materiel("gambrinus1","hp","amd","1000go","8go"));
		TacheInformatique t3=new TacheMateriel("reparer ordinateur", 6, new Materiel("gambrinus2","hp","amd","1000go","8go"));
		TacheInformatique t4=new TacheMateriel("reparer ordinateur", 8, new Materiel("gambrinus3","hp","amd","1000go","8go"));
		TacheInformatique t5=new TacheMateriel("reparer ordinateur", 2, new Materiel("gambrinus4","hp","amd","1000go","8go"));
		TacheInformatique t6=new TacheMateriel("reparer ordinateur", 3, new Materiel("gambrinus5","hp","amd","1000go","8go"));
		TacheInformatique t7=new TacheMateriel("reparer ordinateur", 4, new Materiel("gambrinus6","hp","amd","1000go","8go"));
		TacheInformatique t8=new TacheMateriel("reparer ordinateur", 6, new Materiel("gambrinus7","hp","amd","1000go","8go"));
		TacheInformatique t9=new TacheMateriel("tache test en attente", 6, new Materiel("gambrinus7","hp","amd","1000go","8go"));
		TacheInformatique t10=new TacheLogiciel("installation",6, new Logiciel("JAVA","LKF","123","2/5/2013","java"));
		TacheInformatique t11=new TacheMateriel("tache materiel a mettre en attente", 6, new Materiel("gambrinus5","hp","amd","1000go","8go"));
		TacheInformatique t12=new TacheLogiciel("petite tache",2, new Logiciel("JAVA","LKF","123","2/5/2013","java"));
	

		s.affecterTache(t1);
		s.affecterTache(t2);
		
		s.affecterTache(t3);
		s.affecterTache(t4);
		s.affecterTache(t5);
		s.affecterTache(t6);
		s.affecterTache(t12);
		s.affecterTache(t7);
		s.affecterTache(t8);
		s.affecterTache(t9);
		s.affecterTache(t10);
		
		s.affecterTache(t11);
		
	




		
		System.out.println("Emploi du temps des employes :");
		/*for(TacheMateriel att : s.getTachesEnAttente())
			System.out.println(att);*/

		for(Map.Entry<String,Employe> e : s.getEmployes().entrySet()){
			
			System.out.println(e.getValue()+ ": ");

			for(Creneau c : e.getValue().getEdt())
				System.out.println(c);
				
		}

		for(int i=0;i<5;i++)
					System.out.println("\n");


		System.out.println("Liste des taches en attente");
		for(TacheMateriel att : s.getTachesEnAttente())
			System.out.println(att);
		
		//suppression d une tache
		
		s.supprimerTache(t1);

		System.out.println("Liste des taches en attente");
		for(TacheMateriel att : s.getTachesEnAttente())
			System.out.println(att);

		//reaffichage des emplois du temps de chaque emloye
		for(Map.Entry<String,Employe> e : s.getEmployes().entrySet()){
			
			System.out.println(e.getValue()+ ": ");

			for(Creneau c : e.getValue().getEdt())
				System.out.println(c);
		}

	}
}
