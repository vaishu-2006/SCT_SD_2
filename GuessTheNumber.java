import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();

        int guess;
        int number=random.nextInt(50)+1; //Between 1 and 50
        int attempts=0;

        System.out.println("Welcome to the guess the number contest");
        System.out.println("Try to guess the number between 1 and 50");
        System.out.println("Try to guess the number");

        do { 
            System.out.println("Enter your guess :");
            guess=sc.nextInt();
            attempts++;

            if(guess>number){
                System.out.println("Too high! Try again");
            }
            else if(guess<number){
                System.out.println("Too low! Try again");
            }
            else{
                System.out.println("Your guessed the correct number in " +attempts+ " attempts . Congragulations!!");

            }
        } while (guess!=number);
        sc.close();
    }
}
