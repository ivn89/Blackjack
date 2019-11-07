package Mod3ovn;

import java.util.ArrayList;
import java.util.List;

public class Blackjack {
	private static Blackjack instance = new Blackjack();

	private List<Card> hand = new ArrayList<>();
	
	Deck deck = new Deck();

	public static Blackjack getInstance() {
		return instance;
	}

	public void hit() {
        while (true) {
        if (score() <=20) {
            hand.add(deck.draw());
            System.out.println(hand.get(hand.size()-1).getValue()+" "+
            hand.get(hand.size()-1).getSuit() + " Score: " + score());
            break;}
            else if (score() == 21) {
                System.out.println("Du vann");
                break;}
            else {
                System.out.println("Du förlorade :..( ");}
            break;
        }
    }
	
	

	public void stand() {
		System.out.println(score());
		
	}

	public void reset() {
        hand.clear();
        hand.add(deck.draw());
        System.out.println(hand.get(hand.size()-1).getValue()+" "+
                hand.get(hand.size()-1).getSuit() + " Score: " + score());
        hand.add(deck.draw());
        System.out.println(hand.get(hand.size()-1).getValue()+" "+
                hand.get(hand.size()-1).getSuit() + " Score: " + score());
	}

	private int score() {
		int score = 0, value;

		for (int i = 0; i < hand.size(); i++) {
			value = hand.get(i).getValue();
			switch (value) {
			case 1:
				score += 11;
				break;
			case 11: case 12: case 13:
				score += 10;
				break;
			default:
				score += value;
				break;
			}
		}

		return score;
	}
}
