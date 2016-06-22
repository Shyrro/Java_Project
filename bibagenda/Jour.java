package bibagenda;

public enum Jour {

	Lundi("Lundi"), Mardi("Mardi"), Mercredi("Mercredi"), Jeudi("Jeudi"), Vendredi("Vendredi");

	private final String name;

	private Jour(String s){
		this.name = s;
	}

	public String toString(){
		return this.name;
	}

	public boolean equals(Jour j){

		return this.name.equals(j.name);

	}

}
