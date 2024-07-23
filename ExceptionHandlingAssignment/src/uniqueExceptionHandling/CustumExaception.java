package uniqueExceptionHandling;
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class CustumExaception {
 public static void main(String[] args) {
     try {
         int age = 17; // Change this to test different ages
         if (age < 18) {
             throw new InvalidAgeException("Age should be at least 18");
         } else {
             System.out.println("You are eligible to vote.");
         }
     } catch (InvalidAgeException e) {
         System.out.println("Caught: " + e.getMessage());
     }
 }
}