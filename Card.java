package CodingAssignmentWk6;
//Card class
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Represents a single card with a value and a name
class Card {
 private int value; // Value of the card (2-14, where 14 is Ace)
 private String name; // Name of the card (e.g., "Ace of Diamonds")

 // Constructor
 public Card(int value, String name) {
     this.value = value;
     this.name = name;
 }

 // Getter for value
 public int getValue() {
     return value;
 }

 // Setter for value
 public void setValue(int value) {
     this.value = value;
 }

 // Getter for name
 public String getName() {
     return name;
 }

 // Setter for name
 public void setName(String name) {
     this.name = name;
 }

 // Describe the card by printing its details
 public void describe() {
     System.out.println(name + " (Value: " + value + ")");
 }
}