package be.teama.tijdsbesteding.client.handler;

import be.teama.tijdsbesteding.client.contentzone.Contentzone;
import be.teama.tijdsbesteding.client.contentzone.TijdsbestedingInvoerenZone;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class TijdsbestedingInvoerenClickHandler implements ClickHandler {

	private Contentzone contentzone;
	
	public TijdsbestedingInvoerenClickHandler(Contentzone contentzone) {
		super();
		this.contentzone = contentzone;
	}

	@Override
	public void onClick(ClickEvent event) {
		contentzone.clear();
		contentzone.add(new TijdsbestedingInvoerenZone());
		
	}

}
