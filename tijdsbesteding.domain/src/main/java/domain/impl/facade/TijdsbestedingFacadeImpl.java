package domain.impl.facade;

import java.util.Arrays;
import java.util.List;

import domain.api.PersoonSnapshot;
import domain.api.facade.TijdsbestedingFacade;

public class TijdsbestedingFacadeImpl implements TijdsbestedingFacade {

	public List<PersoonSnapshot> getPersonen() {
		return Arrays.asList(new PersoonSnapshot(1l, "Jef"), new PersoonSnapshot(2l, "Joske"));
	}

}
