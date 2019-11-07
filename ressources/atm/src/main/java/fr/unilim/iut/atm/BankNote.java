package fr.unilim.iut.atm;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class BankNote {

	int value;
	String currency;

	public BankNote(int value, String currency) {
		this.value = value;
		this.currency = currency;
	}

	public String denomination() {
		return ("" + this.value + " " + this.currency);
	}

}
