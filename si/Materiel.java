package si;
public class Materiel {

	
		//attributs 
		private String nom;
		private String numVersion;
		private String typeProcesseur;
		private String tailleMemoireHd;
		private String tailleMemoireRam;
		
		// constructeur
		public Materiel(String nom, String numVersion, String typeProcesseur, String hd, String ram) {
			this.nom=nom;
			this.numVersion=numVersion;
			this.typeProcesseur=typeProcesseur;
			this.tailleMemoireHd=hd;
			this.tailleMemoireRam=ram;
		}
		
		
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
		
		
}
