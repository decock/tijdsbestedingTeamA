package be.teama.tijdsbesteding.server;

import java.util.List;

import be.teama.tijdsbesteding.client.service.TijdsbestedingService;
import be.teama.tijdsbesteding.domain.Story;

import com.google.appengine.labs.repackaged.com.google.common.collect.Lists;

public class TijdsbestedingServiceImpl implements TijdsbestedingService {

	@Override
	public List<Story> getOpenStories() {
		return Lists.newArrayList(
				new Story(80001, "beschrijving", "103", true), new Story(90001,
						"andere beschrijving", "103", true));
	}

}
