package be.teama.tijdsbesteding.server;

import java.util.List;

import be.teama.tijdsbesteding.client.service.TijdsbestedingService;
import be.teama.tijdsbesteding.domain.Story;

import com.google.appengine.labs.repackaged.com.google.common.collect.Lists;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import domain.api.PersoonSnapshot;
import domain.api.facade.TijdsbestedingFacade;

public class TijdsbestedingServiceImpl extends RemoteServiceServlet implements TijdsbestedingService {
	private TijdsbestedingFacade tijdsbestedingFacade;

	@Override
	public List<Story> getActieveStories() {
		return Lists.newArrayList(
				new Story(80001, "beschrijving", "103", true), new Story(90001,
						"andere beschrijving", "103", true));
	}

	@Override
	public List<PersoonSnapshot> getPersonen() {
		return tijdsbestedingFacade.getPersonen();
	}

}
