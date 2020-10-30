package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable
	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {

		innleggtabell = new Innlegg[20];
		nesteledig = 0;

	}

	public Blogg(int lengde) {

		innleggtabell = new Innlegg[lengde];

	}

	public int getAntall() {

		return nesteledig;

	}

	public Innlegg[] getSamling() {

		return innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {

		boolean funnet = false;
		int pos = 0;
		while (pos < nesteledig && !funnet) {
			if (innleggtabell[pos].erLik(innlegg)) {
				funnet = true;
				return pos;
			} else {
				pos++;
			}
		}
		return -1;

	}

	public boolean finnes(Innlegg innlegg) {

		boolean finnes = false;

		int pos = 0;
		while (pos < nesteledig && !finnes) {
			if (pos == finnInnlegg(innlegg)) {
				finnes = true;
				return finnes;
			} else {
				pos++;
			}

		}
		return finnes;
	}

	public boolean ledigPlass() {

		boolean ledigplass = false;

		if (nesteledig < innleggtabell.length - 1) {
			ledigplass = true;
			return ledigplass;
		} else {
			return ledigplass;
		}
		
	}

	public boolean leggTil(Innlegg innlegg) {
		if (!finnes(innlegg)) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;

			return true;
		}
		return false;
		
	}

	public String toString() {
		String innlegg = nesteledig + "\n";
		for (Innlegg element : innleggtabell) {
			innlegg += element.toString();
		}
		return innlegg;
		
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}