package agenda_set;

import java.util.*;

public class Pessoa
{
	private String nome;
	private String telefone;
	private String email;
	private int id;

	public Pessoa(String nome, String telefone, String email, int id) 
	{
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String toString() {
		System.out.println("\n******************************************************************");
		return "Nome:     " + nome + "\nTelefone: " + telefone + "\nEmail:    " + email + "\nID:       " + id;
	}


	
}

