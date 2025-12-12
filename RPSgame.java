import java.util.Scanner;
import java.util.Random;

public class main{
    public static void main(String[] args){
        System.out.println("Let's play rock/paper/scissor!!!, if you wanna play then type yes/no!");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        if(a.equals("yes")){
            System.out.println("Let's move further");
        }else{
            System.out.println("Can't move further");
            return;
        }
        System.out.print("User choice:");
        String my = sc.next();
        
        String[] words = {"rock","paper","scissor"};
        Random r = new Random();
        String comp = words[r.nextInt(words.length)];
        System.out.println("Computer choice:" + comp);
        
        
        if(my.equals("rock") && comp.equals("rock")){
            System.out.println("tie!: no one wins!");
        }else if(my.equals("rock") && comp.equals("paper")){
            System.out.println("rock covers paper : user win");
        }else if(my.equals("rock") && comp.equals("scissor")){
            System.out.println("rock breaks scissor: user win");
        }else if(my.equals("paper") && comp.equals("paper")){
            System.out.println("tie! no one wins!");
        }else if(my.equals("paper") && comp.equals("rock")){
            System.out.println("rock covers paper : comp win");
        }else if(my.equals("paper") && comp.equals("scissor")){
            System.out.println("scissor cuts paper: comp win");
        }else if(my.equals("scissor") && comp.equals("scissor")){
            System.out.println("tie! no one wins!");
        }else if(my.equals("scissor") && comp.equals("rock")){
            System.out.println("rock breaks scissor: comp win");
        }else if(my.equals("scissor") && comp.equals("paper")){
            System.out.println("scissor cuts paper: user win");
        }else{
            System.out.println("Default");
        }
    }
}
