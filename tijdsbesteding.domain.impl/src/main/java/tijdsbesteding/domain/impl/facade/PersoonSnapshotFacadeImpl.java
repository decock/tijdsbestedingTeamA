package tijdsbesteding.domain.impl.facade;

import java.util.List;

import com.google.common.collect.Lists;

import tijdsbesteding.domain.api.facade.PersoonSnapshotFacade;
import tijdsbesteding.domain.api.snapshot.PersoonSnapshot;

public class PersoonSnapshotFacadeImpl implements PersoonSnapshotFacade {

	public List<PersoonSnapshot> getPersonen() {
		return Lists.newArrayList(new PersoonSnapshot(1l, "jefke"), new PersoonSnapshot(2l, "joske"));
	}

}
