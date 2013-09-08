package be.teama.tijdsbesteding.client.linkerzone;

import be.teama.tijdsbesteding.client.contentzone.Contentzone;
import be.teama.tijdsbesteding.client.handler.StoriesBeherenClickHandler;
import be.teama.tijdsbesteding.client.handler.TijdsbestedingInvoerenClickHandler;

import com.google.gwt.user.client.ui.VerticalPanel;

public class Linkerzone extends VerticalPanel {
	public static final String STYLECLASS = "linkerzone";

	public Linkerzone(Contentzone contentzone) {
		this.addStyleName(STYLECLASS);
		this.add(tijdsbestedingInvoerenButton(contentzone));
		this.add(storiesBeherenButton(contentzone));
	}

	private LinkerzoneButton storiesBeherenButton(Contentzone contentzone) {
		return new LinkerzoneButton("Stories beheren", new StoriesBeherenClickHandler(contentzone));
	}

	private LinkerzoneButton tijdsbestedingInvoerenButton(Contentzone contentzone) {
		return new LinkerzoneButton("Tijdsbesteding invoeren",	new TijdsbestedingInvoerenClickHandler(contentzone));
	}

}
