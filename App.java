package CodingAssignmentWk6;

//Application class
//Contains the main method to run the game
public class App {
 public static void main(String[] args) {
     // Create a deck and shuffle it
     Deck deck = new Deck();
     deck.shuffle();

     // Create two players
     Player player1 = new Player("Agent Starling");
     Player player2 = new Player("Dr. Lecter");

     // Deal 52 cards alternately to both players
     for (int i = 0; i < 52; i++) {
         if (i % 2 == 0) {
             player1.draw(deck);
         } else {
             player2.draw(deck);
         }
     }

     // Play 26 rounds
     for (int i = 0; i < 26; i++) {
         System.out.println("\nRound " + (i + 1) + ":");

         // Each player flips a card
         Card card1 = player1.flip();
         Card card2 = player2.flip();

         // Describe the flipped cards
         System.out.println(player1.getName() + " plays: ");
         card1.describe();
         System.out.println(player2.getName() + " plays: ");
         card2.describe();

         // Compare the values of the cards
         if (card1.getValue() > card2.getValue()) {
             System.out.println(player1.getName() + " Well, Clarice - have the lambs stopped screaming?");
             player1.incrementScore();
         } else if (card1.getValue() < card2.getValue()) {
             System.out.println(player2.getName() + " You fly back to school, now, little Starling. ");
             player2.incrementScore();
         } else {
             System.out.println("It's a tie! No points awarded.");
         }
     }

     // Print the final scores and the winner
     System.out.println("\nFinal Scores:");
     System.out.println(player1.getName() + "'s score: " + player1.getScore());
     System.out.println(player2.getName() + "'s score: " + player2.getScore());

     if (player1.getScore() > player2.getScore()) {
         System.out.println(player1.getName() + " wins the game. Well, Clarice - have the lambs stopped screaming?");
     } else if (player1.getScore() < player2.getScore()) {
         System.out.println(player2.getName() + " wins the game. You fly back to school, now, little Starling.");
     } else {
         System.out.println("The game is a draw!");
     }
 }
}

