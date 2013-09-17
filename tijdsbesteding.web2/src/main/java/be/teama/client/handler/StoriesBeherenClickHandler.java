package be.teama.client.handler;

import be.teama.client.contentzone.Contentzone;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Label;

public class StoriesBeherenClickHandler implements ClickHandler {

	private Contentzone contentzone;
	
	public StoriesBeherenClickHandler(Contentzone contentzone) {
		super();
		this.contentzone = contentzone;
	}


	@Override
	public void onClick(ClickEvent event) {
		contentzone.clear();
		contentzone.add(new Label("stories beheren"));
				
	}

}
