package be.teama.tijdsbesteding.client.contentzone;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import be.teama.tijdsbesteding.client.widgets.NormalFieldLabel;
import be.teama.tijdsbesteding.domain.Persoon;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.CalendarUtil;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DatePicker;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;

public class TijdsbestedingInvoerenZone extends HorizontalPanel {
	private static final List<Persoon> personen = Arrays.asList(new Persoon(1,
			"bart"), new Persoon(2, "jozef"), new Persoon(3, "jeroen"),
			new Persoon(4, "nick"));

	public TijdsbestedingInvoerenZone() {
		super();
		VerticalPanel panel = new VerticalPanel();
		panel.add(datumpanel());
		panel.add(registratiepanel());

		this.add(panel);
	}

	private HorizontalPanel registratiepanel() {
		VerticalPanel samenvattingPanel = samenvattingPanel();
		VerticalPanel invoerenPanel = invoerenPanel(samenvattingPanel);
		VerticalPanel lijstMetPersonen = lijstMetPersonen(invoerenPanel,
				samenvattingPanel);
		VerticalPanel bevestigenPanel = bevestigenPanel();

		HorizontalPanel registratiePanel = new HorizontalPanel();
		registratiePanel.add(lijstMetPersonen);
		registratiePanel.add(invoerenPanel);
		registratiePanel.add(samenvattingPanel);
		registratiePanel.add(bevestigenPanel);
		return registratiePanel;
	}

	private VerticalPanel bevestigenPanel() {
		// TODO Auto-generated method stub
		VerticalPanel bevestigenPanel = new VerticalPanel();
		bevestigenPanel.addStyleName("onderdeelregistratiepanel");
		Button bevestig = new Button("Bevestig");
		bevestig.setEnabled(false);
		bevestigenPanel.add(bevestig);

		return bevestigenPanel;
	}

	private VerticalPanel samenvattingPanel() {
		VerticalPanel samenvatting = new VerticalPanel();
		samenvatting.addStyleName("onderdeelregistratiepanel");
		return samenvatting;
	}

	private VerticalPanel invoerenPanel(final VerticalPanel samenvattingPanel) {
		// TODO Auto-generated method stub
		VerticalPanel invoerenPanel = new VerticalPanel();
		invoerenPanel.addStyleName("onderdeelregistratiepanel");
		HorizontalPanel story = new HorizontalPanel();
		final TextBox aantalUren = new TextBox();
		final TextBox storyNummer = new TextBox();
		story.add(new NormalFieldLabel("Story: "));
		story.add(storyNummer);
		HorizontalPanel uren = new HorizontalPanel();
		uren.add(new NormalFieldLabel("Uren: "));
		uren.add(aantalUren);
		final Button toevoegen = new Button("Toevoegen", new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				samenvattingPanel.add(new NormalFieldLabel(aantalUren.getText()
						+ " uur " + storyNummer.getText()));
				aantalUren.setText("");
				storyNummer.setText("");
			}
		});
		invoerenPanel.add(story);
		invoerenPanel.add(uren);
		invoerenPanel.add(toevoegen);
		invoerenPanel.setVisible(false);
		return invoerenPanel;

	}

	private VerticalPanel lijstMetPersonen(final VerticalPanel invoerenPanel,
			final VerticalPanel samenvattingPanel) {
		ProvidesKey<Persoon> keyProvider = new ProvidesKey<Persoon>() {
			public Object getKey(Persoon item) {
				// Always do a null check.
				return (item == null) ? null : item.getId();
			}
		};

		CellList<Persoon> cellList = new CellList<Persoon>(new PersoonCell(),
				keyProvider);
		cellList.setRowCount(personen.size());
		cellList.setRowData(personen);
		cellList.addStyleName("listpersonen");
		final SingleSelectionModel<Persoon> selectionModel = new SingleSelectionModel<Persoon>();
		cellList.setSelectionModel(selectionModel);
		selectionModel
				.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
					public void onSelectionChange(SelectionChangeEvent event) {
						Persoon selected = selectionModel.getSelectedObject();
						if (selected != null) {
							invoerenPanel.setVisible(true);
							samenvattingPanel.add(new Label(
									"Tijdsbesteding voor " + selected.getNaam()
											+ ": "));
						}
					}
				});
		VerticalPanel personenPanel = new VerticalPanel();
		personenPanel.addStyleName("onderdeelregistratiepanel");
		personenPanel.add(cellList);
		return personenPanel;
	}

	private HorizontalPanel datumpanel() {
		DatePicker datePicker = new DatePicker();
		Date dagnietok = new Date();
		CalendarUtil.addDaysToDate(dagnietok, 3);
		datePicker.addStyleName("mydatepicker");
		datePicker.addStyleToDates("dagNietOK", dagnietok);

		DateTimeFormat dateTimeFormat = DateTimeFormat.getFormat("dd/MM/yyyy");
		DateBox datebox = new DateBox(datePicker, new Date(),
				new DateBox.DefaultFormat(dateTimeFormat));

		HorizontalPanel datumPanel = new HorizontalPanel();
		datumPanel.add(new Label("Datum: "));
		datumPanel.add(datebox);
		return datumPanel;
	}

	private class PersoonCell extends AbstractCell<Persoon> {

		@Override
		public void render(com.google.gwt.cell.client.Cell.Context context,
				Persoon persoon, SafeHtmlBuilder sb) {
			sb.appendEscaped(persoon.getNaam());

		}

	}

}
