package agenda_set;

public class TestaProvaAgenda 
{

	public static void main(String[] args) 
	{
		Agenda agenda = new Agenda();

		Pessoa p1 = new Pessoa("Ermo", "99797-6986", "ermo.santos@bol.com.br", 10);
		Pessoa p2 = new Pessoa("Clara", "98570-3570", "claradeb@hotmail.com", 13);
		Pessoa p3 = new Pessoa("Samuel", "98681-6598", "pedrosamu@gmail.com", 12);
		Pessoa p4 = new Pessoa("Aline", "98961-5598", "lisancle@gmail.com", 11);

		agenda.inserir(p1);
		agenda.inserir(p2);
		agenda.inserir(p3);
		agenda.inserir(p4);

		agenda.listar();
		agenda.listarPorId();
		agenda.listarPorNome();
		try {
			agenda.removerPorNome("eduqdu");
		} catch (ContatoNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		agenda.listarPorId();


	}

}
