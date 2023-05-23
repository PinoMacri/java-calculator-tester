package org.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.main.Employee;

public class EmployeeTest {
	@Test
	public void getNomeTest() {
		final String nome = "ff";
		final Employee e = new Employee(nome);
		final String risultatoFinale = e.getNome();
		assertEquals(nome, risultatoFinale);
	}
	@Test
	public void getRuoloNomeTest() {
		final String ruolo = "employee";
		final String nome = "ff";
		final Employee e = new Employee(ruolo, nome);
		assertEquals(ruolo, e.getRuolo());
		assertEquals(nome, e.getNome());
	}
	public void getRuoloNomeCognomeTest() {
		final String ruolo = "boss";
		final String nome = "ff";
		final String cognome = "ff";
		final Employee e = new Employee(nome, cognome, ruolo);
		assertEquals(ruolo, e.getNome());
		assertEquals(cognome, e.getCognome());
		assertEquals(ruolo, e.getRuolo());
	}
}
