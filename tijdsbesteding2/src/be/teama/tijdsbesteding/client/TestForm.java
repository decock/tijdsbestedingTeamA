package be.teama.tijdsbesteding.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class TestForm extends Composite {

	private static TestFormUiBinder uiBinder = GWT
			.create(TestFormUiBinder.class);

	interface TestFormUiBinder extends UiBinder<Widget, TestForm> {
	}

	public TestForm() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
