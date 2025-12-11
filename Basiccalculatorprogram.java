import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();
        
        System.out.println("which operations you want me to perform (add/sub/div/mult/remind)");
        String op = sc.next();
        
        int c1 = a + b;
        int c2 = a - b;
        int c3 = a / b;
        int c4 = a * b;
        int c5 = a % b;
        
        if(op.equals("add")){
        System.out.println("So the add will be:" + c1);
        }else if(op.equals("sub")){
        System.out.println("So the sub will be:" + c2);
        }else if(op.equals("div")){
        System.out.println("So the div will be:" + c3);
        }else if(op.equals("mult")){
        System.out.println("So the multi will be:" + c4);
        }else if(op.equals("remind")){
        System.out.println("So the remind will be:" + c5);
        }else{
            System.out.println("No results");
        }
        System.out.println("You can also check if the numbers are equal or not, to find it write 'find'");
        String ap = sc.next();
 
        if(ap.equals("find")){
            if(a == b){
            System.out.println("both numbers are equal!");
            }else{
            System.out.println("both numbers are  not equal!");    
            }
        }else{
            System.out.println("default");
        }
    }
}
