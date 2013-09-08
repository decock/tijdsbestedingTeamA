package be.teama.tijdsbesteding.client.contentzone;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import be.teama.tijdsbesteding.domain.Persoon;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.CalendarUtil;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DatePicker;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;

public class TijdsbestedingInvoerenZone extends HorizontalPanel {
	private static final List<Persoon> personen = Arrays.asList(new Persoon(1, "bart"), new Persoon(2, "jozef"),new Persoon(3, "jeroen"),new Persoon(4, "nick"));

	public TijdsbestedingInvoerenZone() {
		super();
		DatePicker datePicker = new DatePicker();
		Date dagnietok = new Date();
		CalendarUtil.addDaysToDate(dagnietok, 3);
		datePicker.addStyleName("mydatepicker");
		datePicker.addStyleToDates("dagNietOK", dagnietok);
		
		DateTimeFormat dateTimeFormat = DateTimeFormat.getFormat("dd/MM/yyyy");
		DateBox datebox = new DateBox(datePicker, new Date(), new DateBox.DefaultFormat(dateTimeFormat));
		
		HorizontalPanel datumPanel = new HorizontalPanel();
		datumPanel.add(new Label("Datum: "));
		datumPanel.add(datebox);
		
		ProvidesKey<Persoon> keyProvider = new ProvidesKey<Persoon>() {
	         public Object getKey(Persoon item) {
	            // Always do a null check.
	            return (item == null) ? null : item.getId();
	         }
	      };

		CellList<Persoon> cellList = new CellList<Persoon>(new PersoonCell(), keyProvider);
		cellList.setRowCount(personen.size());
		cellList.setRowData(personen);
		cellList.addStyleName("listpersonen");
		cellList.addStyleName("mgTop");
		final SingleSelectionModel<Persoon> selectionModel = new SingleSelectionModel<Persoon>();
		cellList.setSelectionModel(selectionModel);
		selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
		      public void onSelectionChange(SelectionChangeEvent event) {
		        Persoon selected = selectionModel.getSelectedObject();
		        if (selected != null) {
		          Window.alert("You selected: " + selected.getNaam());
		        }
		      }
		    });
		
		HorizontalPanel registratiePanel = new HorizontalPanel();
		registratiePanel.add(cellList);
		
		VerticalPanel panel = new VerticalPanel();
		panel.add(datumPanel);
		panel.add(registratiePanel);

		this.add(panel);
	}
	
	private class PersoonCell extends AbstractCell<Persoon> {

		@Override
		public void render(com.google.gwt.cell.client.Cell.Context context,
				Persoon persoon, SafeHtmlBuilder sb) {
			sb.appendEscaped(persoon.getNaam());
			
		}
		
	}

	
}
