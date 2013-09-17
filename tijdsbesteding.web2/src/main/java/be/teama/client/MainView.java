package be.teama.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class MainView implements EntryPoint {

	private Label header = new Label("The A Team");
	
	@Override
	public void onModuleLoad() {
		
	    RootPanel.get("header").add(header);
	    RootPanel.get("container").add(new Container());
	}
	
}
