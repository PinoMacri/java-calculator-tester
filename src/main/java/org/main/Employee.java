package org.main;

public class Employee {
	private String nome;
	private String cognome;
	private String ruolo;

	public Employee(String nome, String cognome, String ruolo) {
		setNome(nome);
		setCognome(cognome);
		setRuolo(ruolo);
	}
	public Employee(String nome) {
		setNome(nome);	
	}
	public Employee(String ruolo, String nome) {
		setRuolo(ruolo);
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		 if (nome == null || nome.isEmpty()) {
	            throw new IllegalArgumentException("Il nome non può essere vuoto");
	        }
	        this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		 if (cognome == null || cognome.isEmpty()) {
	            throw new IllegalArgumentException("Il nome non può essere vuoto");
	        }
	        this.cognome = cognome;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		   if (!ruolo.equals("employee") && !ruolo.equals("boss")) {
	            throw new IllegalArgumentException("Il ruolo deve essere 'employee' o 'boss'");
	        }
		this.ruolo = ruolo;
	}

}
