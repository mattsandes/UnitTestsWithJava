package br.com.sandes.math;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class ArraysCompareTest {

	@Test
	void test() {
		int[] numbers = {25, 8, 21, 32, 3};
		int[] expectedArray = {3, 8, 21, 25, 32};
		
		Arrays.sort(numbers);
		
		//essa assertion vai falhar pois o equals vai comparar o objeto e nao o conteudo dos arrays;
		// assertEquals(numbers, expectedArray);
		
		assertArrayEquals(numbers, expectedArray);
	}
	
	//Criado o primeiro teste de performance;
	@Test
	// @Timeout(1)
	@Timeout(value = 15, unit = TimeUnit.MILLISECONDS) //valida que se o teste finalizou dentro de 15 milisegundos;
	void testSortPerformance(){
		int[] numbers = {33, 44, 22, 11, 2};
		
		for(int i = 0; i < 10000; i++) {
			numbers[0] = i;
			Arrays.sort(numbers);
		}
	}

}
