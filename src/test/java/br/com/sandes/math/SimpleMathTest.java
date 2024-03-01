package br.com.sandes.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {

	@Test
	void testSum() {

		SimpleMath math = new SimpleMath();

		double firstNumber = 6.2D;
		double secondNumber = 2D;

		Double actual = math.sum(firstNumber, secondNumber);

		// parametros do assertEquals: o que se espera, a variavel com esse valor;
		double expected = 8.2D;

		// assertEquals(expected, actual); //posso imoprtar esse metodo estaticamente;

		// usando assertion messages: retorna mensagens mais faceis de compreender;

		assertEquals(expected, actual, () -> firstNumber + " + " + secondNumber + " did not produce " + expected + "!");
	}

	@Test
	@DisplayName("This test should return a value the correct resutl for the subtract operation")
	void subtractionTest() {
		SimpleMath math = new SimpleMath();

		double firstNumber = 10.0D;
		double secondNumber = 9.0D;

		double expected = 1.0D;

		Double result = math.subtraction(firstNumber, secondNumber);

		assertEquals(result, expected);
	}

	@Test
	@DisplayName("This test should return the right value for multiplication operation")
	void multiplication() {
		SimpleMath math = new SimpleMath();

		double firstNumber = 10.0D;
		double secondNumber = 9.0D;
		double expected = 90.0D;

		Double result = math.multiplication(firstNumber, secondNumber);

		assertEquals(result, expected, () -> firstNumber + " * " + secondNumber + " did not produce " + expected + "!");
	}

	@Test
	@DisplayName("This test should return the correct value for devision operation")
	void divisionTest() {
		SimpleMath math = new SimpleMath();

		double firstNumber = 90.0D;
		double secondNumber = 10.0D;

		double expected = 9.0D;

		double result = math.division(firstNumber, secondNumber);

		assertEquals(result, expected);
	}

	@Test
	@DisplayName("This test should return the correct value for devision operation")
	void meanTest() {
		SimpleMath math = new SimpleMath();

		double firstNumber = 10.0D;
		double secondNumber = 90.0D;

		double result = math.mean(firstNumber, secondNumber);

		double expected = 50.0D;

		assertEquals(result, expected);
	}

	@Test
	@DisplayName("This test should return the correct value for a square root operation")
	void squareRootTest() {
		SimpleMath math = new SimpleMath();

		double number = 4.0;

		double expected = 2.0;

		double result = math.squareRoot(number);

		assertEquals(expected, result);
	}

}
