package org.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.main.Calculator;

public class CalculatorTest {
	@Test
	public void getSumTest() {
		final float num1 = 10;
		final float num2 = 20;
		final float risultatoAtteso = 30;
		final Calculator c = new Calculator (num1,num2);
		final float risultatoFinale = c.add();
		assertEquals(risultatoAtteso, risultatoFinale);
	}
	@Test
	public void getSubtractTest() {
		final float num1 = 20;
		final float num2 = 10;
		final float risultatoAtteso = 10;
		final Calculator c = new Calculator (num1,num2);
		final float risultatoFinale = c.subtract();
		assertEquals(risultatoAtteso, risultatoFinale);
	}
	@Test
	public void getDivideTest() {
		final float num1 = 20;
		final float num2 = 10;
		final float risultatoAtteso = 2;
		final Calculator c = new Calculator (num1,num2);
		final float risultatoFinale = c.divide();
		assertEquals(risultatoAtteso, risultatoFinale);
	}
	@Test
	public void getMultipltyTest() {
		final float num1 = 20;
		final float num2 = 10;
		final float risultatoAtteso = 200;
		final Calculator c = new Calculator (num1,num2);
		final float risultatoFinale = c.multiply();
		assertEquals(risultatoAtteso, risultatoFinale);
	}

	
}
