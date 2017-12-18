package fr.unilim.iut.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@Before
	public void setup() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void doitRepondre_LeNombre_PourUnCasSimple() {
		assertEquals("1", fizzBuzz.donnerLaReponsePour(1));
		assertEquals("2", fizzBuzz.donnerLaReponsePour(2));
		assertEquals("4", fizzBuzz.donnerLaReponsePour(4));
	}

	@Test
	public void doitRepondre_fizz_PourUnNombreMultipleDe3() {
		assertEquals("fizz", fizzBuzz.donnerLaReponsePour(3));
		assertEquals("fizz", fizzBuzz.donnerLaReponsePour(6));
		assertEquals("fizz", fizzBuzz.donnerLaReponsePour(9));
	}

	@Test
	public void doitRepondre_buzz_PourUnNombreMultipleDe5() {
		assertEquals("buzz", fizzBuzz.donnerLaReponsePour(5));
		assertEquals("buzz", fizzBuzz.donnerLaReponsePour(10));
		assertEquals("buzz", fizzBuzz.donnerLaReponsePour(20));
	}

	@Test
	public void doitRepondre_fizzbuzz_PourUnNombreMultipleDe3EtMultipleDe5() {
		assertEquals("fizzbuzz", fizzBuzz.donnerLaReponsePour(15));
		assertEquals("fizzbuzz", fizzBuzz.donnerLaReponsePour(30));
		assertEquals("fizzbuzz", fizzBuzz.donnerLaReponsePour(45));
	}
}
