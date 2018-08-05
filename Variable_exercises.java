// Create a small program that defines some fields. Try creating some illegal field names and see what kind of error the compiler produces. Use the naming rules and conventions as a guide.
// In the program you created in Exercise 1, try leaving the fields uninitialized and print out their values. Try the same with a local variable and see what kind of compiler errors you can produce. Becoming familiar with common compiler errors will make it easier to recognize bugs in your code.
//

public class Variable_exercises{
  public static void main(String[] args) {
    int myAge = 26;
    String myName = "Solomon Sokoya";
    boolean areYouReal = true;

    System.out.println( "My name is " + myName);
    System.out.println( "My age is " + myAge);
    System.out.println( "I am real " + areYouReal);
  }
}
