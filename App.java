package com.promineotech6;

public class App {

	public static void main(String[] args) {
	
		Deck deck = new Deck();//establishing the desk
		Player player1 = new Player("1");//establishing player names
		Player player2 = new Player("2");
		deck.shuffle();//shuffling
		
		
		for (int i = 0; i < 52; i++) {// this is getting the players to each draw a card
			if (i % 2 == 0) {
				player1.draw(deck);
			}else {
				player2.draw(deck);
			}
		}
		
		for (int i = 0; i < 26; i++) {//loop for players to get and flip cards
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			if(player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore(); // adding score if player 1 wins the hand
			}else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();// adding score if player 2 wins the hand
			}
		}
        System.out.printf("Player1 score = %d\n", player1.getScore());//showing player 1's score
        System.out.printf("Player2 score = %d\n", player2.getScore());// showing player 2's score
        if (player1.getScore() > player2.getScore()) {
        	System.out.println("Player 1 is the victor");// adding who one if it was a draw
        }else if(player2.getScore() > player1.getScore()) {
            System.out.println("Player 2 is the victor");
        }else {
        	System.out.println("War has come to a draw");
        }

	}

}
