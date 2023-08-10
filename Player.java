package com.promineotech6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	public Player() {
		score = 0;// setting players scores at 0
	}
	public Player(String newName) {
		name= newName;
		score = 0; // method for establishing the players name and starting score
	}
	public void descirbe() {
		System.out.printf("Player %s has the following cards: \n", name);
		for (Card card : hand) {
			card.describe();// Describing the players hand 
		}
	}
	public Card flip() {
		return hand.remove(0); //method for flip and removing the card that has been used
	}
	public void draw (Deck deck) {
		hand.add(deck.draw()); // method drawing a card and adding it to the players hand
	}
	public void incrementScore() {
		score++;// adding score for the player who wins the hand
	}
	public int getScore() {
		return score;// this is how the score is stored
	}

}