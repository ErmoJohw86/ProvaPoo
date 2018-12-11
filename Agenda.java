package agenda_set;


import java.util.*;


public class Agenda 
{
	Set<Pessoa> contatos = new HashSet<>();

	public void inserir(Pessoa p) 
	{
		contatos.add(p);
	}

	public Pessoa buscarPorId(int id) 
	{
		for (Pessoa pe : contatos) 
		{
			if (pe.getId()==id) {
				return pe;
			}
		}
		return null;
	}
	
	public Pessoa buscarPorNome(String nome) 
	{
		for (Pessoa pe : contatos) 
		{
			if (pe.getNome()==nome) {
				return pe;
			}
		}
		return null;
	}

	public void atualizarNome(int id, String nome) 
	{
		Pessoa pe = buscarPorId(id);
		pe.setNome(nome);
		System.out.println("Nome de: " + nome + " foi atualizado com sucesso!\n");
	}

	public void atualizarEmail(int id, String email) 
	{
		Pessoa pe = buscarPorId(id);
		pe.setEmail(email);
		System.out.println("Email de: " + pe.getNome() + " foi atualizado com sucesso!\n");
	}

	public void atualizarTelefone(int id, String telefone) 
	{
		Pessoa pe = buscarPorId(id);
		pe.setTelefone(telefone);
		System.out.println("Telefone de: " + pe.getNome() + " foi atualizado com sucesso!\n");
	}

	public ArrayList<Pessoa> hashToArraylist(Set<Pessoa> contatos) 
	{
		ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();
		for (Pessoa pe : contatos) 
		{
			agenda.add(pe);
		}
		return agenda;
	}

	public void listarPorId() {
		ComparatorId comparator = new ComparatorId();
		ArrayList<Pessoa> pe = hashToArraylist(contatos);
		Collections.sort(pe, comparator);

		System.out.println("     Organizando contatos por ordem crescente do ID\n");
		for (Pessoa p : pe) {
			System.out.println(p);
		}
		System.out.println("------------------------------------------------------------");
	}

	public void listarPorNome() {
		ComparatorNome comparator = new ComparatorNome();
		ArrayList<Pessoa> pe = hashToArraylist(contatos);
		Collections.sort(pe, comparator);

		System.out.println("     Organizando contatos por ordem alfabética\n");
		for (Pessoa p : pe) {
			System.out.println(p);
		}
		System.out.println("------------------------------------------------------------");
	}

	public void removerPorId(int id) throws ContatoNotFoundException 
	{
		boolean remove = false;
		Pessoa pe = buscarPorId(id);

		remove = contatos.remove(pe);
		if (remove) {
			System.out.println("Contato com Id " + id + " foi removido com sucesso!\n");
		} else {
			throw new ContatoNotFoundException("Contato não encontrado!");
		}
	}
	
	public void removerPorNome(String nome) throws ContatoNotFoundException 
	{
		boolean remove = false;
		Pessoa pe = buscarPorNome(nome);

		remove = contatos.remove(pe);
		if (remove) {
			System.out.println("Contato com nome: " + nome + " ,foi removido com sucesso!\n");
		} else {
			throw new ContatoNotFoundException("Contato não encontrado!");
		}
	}
	
	
	public void listar() 
	{
		System.out.println("    Listando contatos de forma aleatória");
		for(Pessoa pe: contatos) 
		{
			System.out.println(pe);
		}

	}

	public void atualizar(String nome, String telefone, String email, int id) 
	{
		inserir(new Pessoa(nome, telefone, email, id));   
	}
}