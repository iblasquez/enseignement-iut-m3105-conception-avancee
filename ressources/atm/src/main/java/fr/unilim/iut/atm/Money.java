package fr.unilim.iut.atm;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.joining;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class Money {
	public static final Money NO = new Money(Collections.emptyList());

	private final List<BankNotesBundle> notes;

	public Money add(BankNotesBundle newNotes) {

		List<BankNotesBundle> updatedNotes = this.notes.stream().collect(Collectors.toList());

		updatedNotes.add(newNotes);
		return new Money(updatedNotes);
	}

	private Money(List<BankNotesBundle> notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return notes.stream()
				.map(BankNotesBundle::toString)
				.collect(joining());
	}

}
