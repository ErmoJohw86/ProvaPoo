package agenda_set;

import java.util.Comparator;

public class ComparatorId implements Comparator<Pessoa>
{

	@Override
	public int compare(Pessoa pe1, Pessoa pe2) 
	{
		return pe1.getId() - pe2.getId();
	}

}
