package be.teama.tijdsbesteding.client.linkerzone;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;

public class LinkerzoneButton extends Button {

	public static final String STYLECLASS = "menubutton";

	public LinkerzoneButton(String html, ClickHandler handler) {
		super(html, handler);
		this.addStyleName(STYLECLASS);
	}

	
}
