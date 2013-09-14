package domain.api;

public class PersoonSnapshot {

	private Long id;
	private String naam;
	
	public PersoonSnapshot(Long id, String naam) {
		this.id = id;
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}
	
	public Long getId() {
		return id;
	}
	
}
