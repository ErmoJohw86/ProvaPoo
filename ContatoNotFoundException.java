package agenda_set;

public class ContatoNotFoundException extends Exception 
{
	private static final long serialVersionUID = 1L;

	ContatoNotFoundException() {
		super();
	}

	ContatoNotFoundException(String msg) {
		super(msg);
	}
}
