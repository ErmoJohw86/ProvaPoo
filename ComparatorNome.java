package agenda_set;

import java.util.Comparator;

public class ComparatorNome implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa pe1, Pessoa pe2) {
		
		return pe1.getNome().compareTo(pe2.getNome());
	}

}
