package be.teama.tijdsbesteding.client;

import javax.print.DocPrintJob;

import org.apache.tools.ant.taskdefs.Javadoc.Html;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainView implements EntryPoint {

	private Label header = new Label("The A Team");
	private Button tijdsbestedingInvoerenButton = new MenuButton("Tijdsbesteding invoeren");
	private Button storiesBeherenButton = new MenuButton("Stories beheren");

	@Override
	public void onModuleLoad() {
		DockPanel dockpanel = new DockPanel();
		dockpanel.addStyleName("dockpanel");
		dockpanel.setSpacing(4);
	    dockpanel.setHorizontalAlignment(DockPanel.ALIGN_CENTER);
		dockpanel.add(header, DockPanel.NORTH);
		VerticalPanel linkerzone = new VerticalPanel();
		linkerzone.addStyleName("linkerzone");
		linkerzone.add(tijdsbestedingInvoerenButton);
		linkerzone.add(storiesBeherenButton);
		dockpanel.add(linkerzone, DockPanel.WEST);
		HorizontalPanel content = new HorizontalPanel();
		content.addStyleName("contentzone");
		content.add(new Label("Hier komt al de magic!"));
		dockpanel.add(content, DockPanel.EAST);
		
		VerticalPanel vPanel = new VerticalPanel();
	    vPanel.add(dockpanel);

	    RootPanel.get().add(vPanel);
	}
	
	private class MenuButton extends Button {


		public MenuButton(String html) {
			super(html);
			this.addStyleName("menubutton");
		}
		
	}

}
