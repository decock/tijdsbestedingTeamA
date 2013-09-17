package be.teama.client.service;

import java.util.List;


import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import domain.api.PersoonSnapshot;

@RemoteServiceRelativePath("tijdsbestedingService")
public interface TijdsbestedingService extends RemoteService {

	List<Story> getActieveStories();
	
	List<PersoonSnapshot> getPersonen();
}
