package CodingAssignmentWk6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Deck class
//Represents a deck of 52 cards
class Deck {
 private List<Card> cards; // List to hold all the cards

 // Constructor to initialize and populate the deck
 public Deck() {
     cards = new ArrayList<>();
     String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
     String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

     // Populate the deck with 52 cards
     for (String suit : suits) {
         for (int i = 0; i < ranks.length; i++) {
             cards.add(new Card(i + 2, ranks[i] + " of " + suit));
         }
     }
 }

 // Shuffle the deck
 public void shuffle() {
     Collections.shuffle(cards);
 }

 // Draw a card from the top of the deck
 public Card draw() {
     return cards.remove(0);
 }
}