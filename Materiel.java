package si;
public class Materiel {

	
		//attributs 
		private String nom;
		private String numVersion;
		private String typeProcesseur;
		private double tailleMemoireHd;
		private double tailleMemoireRam;
		
		
		//methodes
		public String getNom() {
		return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getNumVersion() {
			return numVersion;
		}
		public void setNumVersion(String numVersion) {
			this.numVersion = numVersion;
		}
		public String getTypeProcesseur() {
			return typeProcesseur;
		}
		public void setTypeProcesseur(String typeProcesseur) {
			this.typeProcesseur = typeProcesseur;
		}
		public double getTailleMemoireHd() {
			return tailleMemoireHd;
		}
		public void setTailleMemoireHd(double tailleMemoireHd) {
			this.tailleMemoireHd = tailleMemoireHd;
		}
		public double getTailleMemoireRam() {
			return tailleMemoireRam;
		}
		public void setTailleMemoireRam(double tailleMemoireRam) {
			this.tailleMemoireRam = tailleMemoireRam;
		}
		
		
}
