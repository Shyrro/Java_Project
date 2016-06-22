package si;
public class Materiel {

	
		//attributs 
		private String nom;
		private String marque;
		private String typeProcesseur;
		private String tailleMemoireHd;
		private String tailleMemoireRam;
		
		// constructeur
		public Materiel(String nom, String marque, String typeProcesseur, String tailleMemoireHd, String tailleMemoireRam) {
			this.nom=nom;
			this.marque=marque;
			this.typeProcesseur=typeProcesseur;
			this.tailleMemoireHd=tailleMemoireHd;
			this.tailleMemoireRam=tailleMemoireRam;
		}
		
		
		//methodes
		public String getNom() {
		return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getMarque() {
			return marque;
		}
		public void setMarque(String marque) {
			this.marque = marque;
		}
		public String getTypeProcesseur() {
			return typeProcesseur;
		}
		public void setTypeProcesseur(String typeProcesseur) {
			this.typeProcesseur = typeProcesseur;
		}
		public String getTailleMemoireHd() {
			return tailleMemoireHd;
		}
		public void setTailleMemoireHd(String tailleMemoireHd) {
			this.tailleMemoireHd = tailleMemoireHd;
		}
		public String getTailleMemoireRam() {
			return tailleMemoireRam;
		}
		public void setTailleMemoireRam(String tailleMemoireRam) {
			this.tailleMemoireRam = tailleMemoireRam;
		}
		public String toString(){
			return "Nom: "+nom +" marque : "+marque;
		}
		
}
