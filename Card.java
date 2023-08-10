package com.promineotech6;



public class Card {

	private int value;
	private String name;
	
public Card(int newValue, String suit) {
	value = newValue;
	
	switch(newValue) {//giving the cards a value
	case 2: name = "two";
		break;
	case 3: name = "three";
		break;
	case 4: name = "four";
		break;
	case 5: name = "five";
		break;
	case 6: name = "six";
		break;
	case 7: name = "seven";
		break;
	case 8: name = "eight";
		break;
	case 9: name = "nine";
		break;
	case 10: name = "ten";
		break;
	case 11: name = "Jack";
		break;
	case 12: name = "Queen";
		break;
	case 13: name = "King";
		break;
	case 14: name = "Ace";
		break;
	}
	
	name += "of" + suit; //giving the cards a name
	
		
}
	public void describe() { // Describing the cards
		System.out.printf("Card: %s with value of %d\n", name, value);
	}
	//Getters and Setters for Values and Names
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}