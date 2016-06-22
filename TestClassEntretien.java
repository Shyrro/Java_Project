// classe de test 
import bibagenda.*;
import entretien.*;
import java.util.*;

public class TestClassEntretien {

	public static void main (String[] args) {

		ServiceEntretien s = new ServiceEntretien("Service Central");

		Employe e1=new Employe("Sahmane");

		Employe e2=new Employe("Lavigne");


		s.ajoutEmploye(e1);

		s.ajoutEmploye(e2);
	
		//affichage des employes du service
		System.out.println("Employes faisant partie du service \n");
		for(Map.Entry<String,Employe> e : s.getEmployes().entrySet()){
			System.out.println(e.getValue());
		}
		System.out.println("\n \n \n");


		//affichage de l'emploi du temps des employes avant affectation de taches

		for(Map.Entry<String,Employe> e : s.getEmployes().entrySet()){
			
			System.out.println("Emploi du temps de " + e.getValue() + " :\n ");

			for(Creneau c : e.getValue().getEdt())
				System.out.println(c);
				/*for(int i=0;i<40;i++)
					System.out.println(e.getValue().getEdt().get(i));*/
		}
		
		for(int i=0;i<5;i++)
					System.out.println("\n");

		TacheEntretien t1=new TacheEntretien("nettoyer le sol", 8,"b203");
		TacheEntretien t2=new TacheEntretien("deboucher les toilettes", 2,"toilette");

		s.affecterTache(t1);
		s.affecterTache(t2);

		for(Map.Entry<String,Employe> e : s.getEmployes().entrySet()){
			
			System.out.println(e.getValue()+ ": ");

			for(Creneau c : e.getValue().getEdt())
				System.out.println(c);
			}
		

		for(int i=0;i<5;i++)
					System.out.println("\n");

		s.supprimerTache(t1);
		System.out.println("Apres suppression : ");

		for(Map.Entry<String,Employe> e : s.getEmployes().entrySet()){
			
			System.out.println(e.getValue()+ ": ");

			for(Creneau c : e.getValue().getEdt())
				System.out.println(c);				
		}

	}
}
