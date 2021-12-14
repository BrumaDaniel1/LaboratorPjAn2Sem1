package labjava;

import java.util.Comparator;

public class SortareDupaNrStud implements Comparator<Curs> {

	@Override
	public int compare(Curs o1, Curs o2) {
		if(o1.studenti.size()<o2.studenti.size())
			return -1;
		else
			if(o1.studenti.size()>o2.studenti.size())
				return 1;
			else
				return 0;
		//return o1.studenti.size() < o2.studenti.size();
	}

}
