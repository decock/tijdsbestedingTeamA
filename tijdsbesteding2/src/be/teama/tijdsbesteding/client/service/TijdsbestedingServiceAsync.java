package be.teama.tijdsbesteding.client.service;

import java.util.List;

import be.teama.tijdsbesteding.domain.Story;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface TijdsbestedingServiceAsync {

	void getOpenStories(AsyncCallback<List<Story>> callback);

}
