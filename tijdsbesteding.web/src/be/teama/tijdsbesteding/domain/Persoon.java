package be.teama.tijdsbesteding.domain;

public class Persoon {

	private long id;
	private String naam;

	public Persoon(long id, String naam) {
		this.id = id;
		this.naam = naam;
	}

	public long getId() {
		return id;
	}

	public String getNaam() {
		return naam;
	}
}
