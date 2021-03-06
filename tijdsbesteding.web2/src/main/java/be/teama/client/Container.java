package be.teama.client;

import be.teama.client.contentzone.Contentzone;
import be.teama.client.linkerzone.Linkerzone;

import com.google.gwt.user.client.ui.DockPanel;

public class Container extends DockPanel {
	
	public static final String STYLECLASS = "dockpanel";

	public Container() {
		super();
		this.addStyleName(STYLECLASS);
		this.setSpacing(4);
		this.setHorizontalAlignment(DockPanel.ALIGN_CENTER);

		Contentzone contentzone = new Contentzone();
		Linkerzone linkerzone = new Linkerzone(contentzone);
		this.add(linkerzone, DockPanel.WEST);
		this.add(contentzone, DockPanel.EAST);
	}

	
}
