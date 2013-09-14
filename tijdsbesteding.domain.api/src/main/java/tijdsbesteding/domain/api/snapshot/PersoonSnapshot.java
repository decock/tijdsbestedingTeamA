package tijdsbesteding.domain.api.snapshot;

import java.io.Serializable;

public class PersoonSnapshot implements Serializable {

	private Long id;
	private String naam;

	public PersoonSnapshot(Long id, String naam) {
		this.id = id;
		this.naam = naam;
	}

	public Long getId() {
		return id;
	}

	public String getNaam() {
		return naam;
	}

}
