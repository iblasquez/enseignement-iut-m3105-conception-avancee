package fr.unilim.iut.atm;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class BankNotesBundle {

	BankNote bankNote;
	int numberOfNotes;

	public BankNotesBundle(BankNote bankNote, int numberOfNotes) {
		this.bankNote = bankNote;
		this.numberOfNotes = numberOfNotes;
	}

	@Override
	public String toString() {
		return ("" + this.numberOfNotes + " * " + this.bankNote.denomination());
	}

}
