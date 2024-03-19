package br.com.sandes.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("This classe should store tests for the SimpleMath class")
public class SimpleMathTest {
	
	SimpleMath math;

	@BeforeAll
	static void setUp(){
		System.out.println("Running the @BeforeAll method");
	}

	@AfterAll
	static void cleanUp(){
		System.out.println("Running the @AfterAll method");
	}
	
	@BeforeEach
	void beforeEachMethod() {
		System.out.println("Running thhe @BeforeEach method");
		math = new SimpleMath();
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Running the @AfterEach method");
	}

	@Test
	@DisplayName("This test should return the correct value for a sum operation")
	void testSum() {

		//Given (Arrange)
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		double expected = 8.2D;

		//When (Act)
		Double actual = math.sum(firstNumber, secondNumber);

		//Then (Assert)
		// parametros do assertEquals: o que se espera, a variavel com esse valor;

		// assertEquals(expected, actual); //posso imoprtar esse metodo estaticamente;

		// usando assertion messages: retorna mensagens mais faceis de compreender;

		assertEquals(expected, actual, () -> firstNumber + " + " + secondNumber + " did not produce " + expected + "!");
	}

	@Test
	@DisplayName("This test should return a value the correct resutl for the subtract operation")
	void subtractionTest() {

		double firstNumber = 10.0D;
		double secondNumber = 9.0D;

		double expected = 1.0D;

		Double result = math.subtraction(firstNumber, secondNumber);

		assertEquals(result, expected);
	}

	@Test
	@DisplayName("This test should return the right value for multiplication operation")
	void multiplication() {

		double firstNumber = 10.0D;
		double secondNumber = 9.0D;
		double expected = 90.0D;

		Double result = math.multiplication(firstNumber, secondNumber);

		assertEquals(result, expected, () -> firstNumber + " * " + secondNumber + " did not produce " + expected + "!");
	}

	@Test
	@DisplayName("This test should return the correct value for devision operation")
	void divisionTest() {

		double firstNumber = 90.0D;
		double secondNumber = 10.0D;

		double expected = 9.0D;

		double result = math.division(firstNumber, secondNumber);

		assertEquals(result, expected);
	}

	@Test
	@DisplayName("This test should return the correct value for devision operation")
	void meanTest() {

		double firstNumber = 10.0D;
		double secondNumber = 90.0D;

		double result = math.mean(firstNumber, secondNumber);

		double expected = 50.0D;

		assertEquals(result, expected);
	}

	@Test
	@DisplayName("This test should return the correct value for a square root operation")
	void squareRootTest() {

		double number = 4.0;

		double expected = 2.0;

		double result = math.squareRoot(number);

		assertEquals(expected, result);
	}
	
	//test[System Uder Test]_[Conditioin or State Change]_[Expected Result]
	@Test
	@DisplayName("Assert that a division by zero will always fail!")
	void testDivision_When_FirstNumberIsDividedByZero_ShouldThrow_ArithmeticExxception() {
		
		//given
		double firstNumber = 0;
		double secondNumber = 5.6D;
		
		var expectedMessage = "Impossible dividir por zero!";

		//when
		math.division(firstNumber, secondNumber);
		
		//then
		ArithmeticException actual = assertThrows(ArithmeticException.class, () -> {
			math.division(firstNumber, secondNumber);
		}, () -> "Division by zero should throw an ArithmeticExcpetion");
		
		assertEquals(expectedMessage, actual.getMessage());
	}
}
