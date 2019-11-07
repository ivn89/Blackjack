package Mod3ovn;

import org.junit.jupiter.api.Test;

public class TestStuff {
	
	@Test
	void testdeck() {
		Deck deck = new Deck();
		assertEquals(4, Deck.length(), "Det finns 4 olika kategorier");
	}
}
