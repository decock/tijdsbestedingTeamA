package be.teama.tijdsbesteding.client.service;

import java.util.List;

import be.teama.tijdsbesteding.domain.Story;

import com.google.gwt.user.client.rpc.RemoteService;

public interface TijdsbestedingService extends RemoteService {

	List<Story> getOpenStories();
}