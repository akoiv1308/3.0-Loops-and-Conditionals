import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Good morning/ afternoon/ evening :) \nTask: enter 2 numbers, preferably first number entered being less than the second, and both being integers (ex: 1, 5, 100; no 7.6, 0.1). Anyways, let's begin: \n");
    // User input //
    Scanner userInput = new Scanner(System.in); 
    System.out.println("Enter a lower limit: " + "\nPress enter for an upper limit! \n");
    int lowerLimit = userInput.nextInt(); 
    int upperLimit = userInput.nextInt();
    userInput.close();
    // Saving user inputs into userInput for further use. //
    // Making sure that the fisrt number is less than the second //
    if (lowerLimit > upperLimit) {
      System.out.print("You entered numbers incorrectly. Please repeat the same process by rerunning the programm again. Thanks!");
      System.exit(0);
    }
    System.out.println("Great numbers! Let's begin the execution\n");
    System.out.println("The output will be as follow: Number + Factor(s) + Prime + Perfect Square \n" + "0 = No/False, 1 = Yes/True \n");
    // For Loop works through each number between the two entered integers and prints characteristics of each number//
    for(int i = lowerLimit; i <= upperLimit; i++) {
      System.out.println("Number " + i + ": " + " " + factors(i) + " Factor(s) "+ prime(i) + "  " + perfect(i));
    }
  }
  // This static method determines the number of factors the number has. Once it determines the amount of factors, it return value and therefore the number of factors. //
  // This was the hardest part to complete. //
  public static int factors(int i) {
    int value = 0;
    // For loop works until currentNumber is less than or equal to int i. //
    for(int currentNumber = 1; currentNumber <= i; currentNumber++) {
      // If when divided current number (i) by currentNumber resuts in a whole number, meaning there is nothing left as a remainder, increase int value by one. //
      if (i % currentNumber == 0) {
        value += 1;
      }
    }
    return value;
  }
  // It was much easier to code after figuring out static method for factors because the rest was based of that. //
  // Since prime number is any number that is greater than 1 and is only divisible by one and itself, I started with an if statement that separates numbers greater than 1 and not and then simply used another if statement to identify whether the number of factors the current number has is less than 3 and therefore looped that to determine for every number. //
  public static int prime(int i) {
    int result = 0;
    if (i > 1) {
      if (factors(i) < 3) {
        result += 1; 
      }
    }
    return result;
  }
  // Function that determines whether the number is a perfect square or not //
  // Using one of the website attached, I understood that perfect square numbers have odd number of factors, so I coded that by creating an if statement in which was stated that if num of factors is even, do not do anything, however, if it's not, increase int value by one and therefore recognizing the perfect square number. //
  public static int perfect(int i) {
    int value = 0;
    if(factors(i) % 2 == 0) {
    }
    else if (factors(i) % 2 != 0) {
      value += 1;
    }
    return value;
  }

}