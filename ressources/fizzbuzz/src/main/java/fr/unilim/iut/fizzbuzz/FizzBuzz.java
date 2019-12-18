package fr.unilim.iut.fizzbuzz;

public class FizzBuzz {

	public String donnerLaReponsePour(Integer nombre) {

		if (estFizzBuzz(nombre))
			return "fizzbuzz";

		if (estBuzz(nombre))
			return "buzz";

		if (estFizz(nombre))
			return "fizz";

		return String.valueOf(nombre);
	}

	private boolean estFizzBuzz(Integer nombre) {
		return 0 == nombre % (3 * 5);
	}

	private boolean estBuzz(Integer nombre) {
		return 0 == nombre % 5;
	}

	private boolean estFizz(Integer nombre) {
		return 0 == nombre % 3;
	}

}
