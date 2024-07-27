import java.util.Scanner;

public class stringmethod {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value :- ");
        String s1 = sc.nextLine().toUpperCase();
        System.out.println("Enter value :- ");
        String s2 = sc.nextLine().toLowerCase();
        System.out.println("Your first value :- " + s1);
        System.out.println("Your second value :- " + s2);
        s1 = s1.toLowerCase();
        s2 = s2.toUpperCase();
        System.out.println("After modificatioin Your first value :- " + s1);
        System.out.println("After modificatioin Your second value :- " + s2);
        //System.out.println("Total Character you Entered with Space :- " + s1.length());
    }
}
