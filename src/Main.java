import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lets play a guessing game!");
        int answer = (int)(Math.random()*10) + 1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a number: ");
            int guess = scanner.nextInt();
            if (guess == answer) {
                System.out.println("You got it! Congrats!");
                return;
            }
            else {
                System.out.println("Nope!");
            }
        }
        System.out.println("Sorry, you lose! The answer was " + answer);
    }
}
