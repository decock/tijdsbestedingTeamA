package tijdsbesteding.domain.api.facade;

import java.util.List;

import tijdsbesteding.domain.api.snapshot.PersoonSnapshot;

public interface PersoonSnapshotFacade {

	List<PersoonSnapshot> getPersonen();
}
