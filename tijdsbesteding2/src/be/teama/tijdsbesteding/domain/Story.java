package be.teama.tijdsbesteding.domain;

public class Story {
	private long id;
	private String beschrijving;
	private String werkorder;
	private boolean actief;

	public Story(long id, String beschrijving, String werkorder, boolean actief) {
		this.id = id;
		this.beschrijving = beschrijving;
		this.werkorder = werkorder;
		this.actief = actief;
	}

	public long getId() {
		return id;
	}

	public String getBeschrijving() {
		return beschrijving;
	}

	public String getWerkorder() {
		return werkorder;
	}

	public boolean isActief() {
		return actief;
	}

}
