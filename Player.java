package CodingAssignmentWk6;

import java.util.ArrayList;
import java.util.List;

//Player class
//Represents a player with a hand of cards, a score, and a name
class Player {
 private List<Card> hand; // The player's hand
 private int score; // The player's score
 private String name; // The player's name

 // Constructor
 public Player(String name) {
     this.name = name;
     this.hand = new ArrayList<>();
     this.score = 0;
 }

 // Getter for score
 public int getScore() {
     return score;
 }

 // Getter for name
 public String getName() {
     return name;
 }

 // Draw a card from the deck and add it to the player's hand
 public void draw(Deck deck) {
     hand.add(deck.draw());
 }

 // Flip the top card from the player's hand
 public Card flip() {
     return hand.remove(0);
 }

 // Increment the player's score by 1
 public void incrementScore() {
     score++;
 }

 // Describe the player and their hand
 public void describe() {
     System.out.println("Player: " + name);
     System.out.println("Score: " + score);
     for (Card card : hand) {
         card.describe();
     }
 }
}
