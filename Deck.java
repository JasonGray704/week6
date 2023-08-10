package com.promineotech6;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;


public class Deck {
    
List<Card>cards = new ArrayList<Card>();
List<String> suits = Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades");

public Deck() {
	for(int i = 2; i < 15; i++) {//populating the deck with the suits
		for(String suit : suits){// populating the deck with cards 2 through Ace
			cards.add(new Card(i, suit));
		}
	}
}

public void shuffle() {
	Collections.shuffle(cards);// shuffling the deck
}
public Card draw() {
	return cards.remove(0);//removing the card that has been drawn
}
}

