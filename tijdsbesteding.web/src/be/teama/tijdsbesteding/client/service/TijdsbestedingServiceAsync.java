package be.teama.tijdsbesteding.client.service;

import java.util.List;

import be.teama.tijdsbesteding.domain.Story;

import com.google.gwt.user.client.rpc.AsyncCallback;

import domain.api.PersoonSnapshot;

public interface TijdsbestedingServiceAsync {

	void getActieveStories(AsyncCallback<List<Story>> callback);

	void getPersonen(AsyncCallback<List<PersoonSnapshot>> callback);

}
