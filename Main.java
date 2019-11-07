package Mod3ovn;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList cards = new ArrayList();
//		
//		Card card = new Card(8, Suit.CLUBS);
//		
//		System.out.println(card.getValue());
//		System.out.println(card.getSuit());
		
		 Blackjack black = Blackjack.getInstance();
	        Scanner scn = new Scanner(System.in);
	        // cards.get(index), loop
	        System.out.println("Välkommen till Blackjackspel!");
	        String s;
	       // System.out.println("\nVad vill du göra? HIT, STAND eller RESET? \n");
	        black.reset();
	        while(true) {
	            System.out.println("\nVad vill du göra? HIT, STAND eller RESET?");
	            s = scn.next();
	            if(s.toLowerCase().equals("hit")) {
	                black.hit();
	            }else if(s.toLowerCase().equals("stand")) {
	                black.stand();
	                
	            }else if (s.toLowerCase().equals("reset")) {
	                black.reset();
	                
	            }else if (s.toLowerCase().equals("exit")){
	                break;
	            }
	        }
	    }
}


