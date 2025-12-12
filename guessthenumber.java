//number guessing game!!!
import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        System.out.print("Guess the number between 0 to 9: ");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();

        int comp = (int)(Math.random()*10);

        if(guess == comp){
            System.out.println("correct guess!!");
        }else{
            System.out.println("wrong guess!!");
        }
    }
}
