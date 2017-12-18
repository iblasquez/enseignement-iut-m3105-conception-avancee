package fr.unilim.iut.fizzbuzz;

public class FizzBuzz {

	public String donnerLaReponsePour(Integer nombre) {

		if (isFizzBuzz(nombre))
			return "fizzbuzz";

		if (isBuzz(nombre))
			return "buzz";

		if (isFizz(nombre))
			return "fizz";

		return String.valueOf(nombre);
	}

	private boolean isFizzBuzz(Integer nombre) {
		return 0 == nombre % (3 * 5);
	}

	private boolean isBuzz(Integer nombre) {
		return 0 == nombre % 5;
	}

	private boolean isFizz(Integer nombre) {
		return 0 == nombre % 3;
	}

}
