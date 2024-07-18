import java.util.Scanner;

class grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage :- ");
        int marks = sc.nextInt();
        if(marks <= 100 && marks > 90){
            System.out.println("Your grade is A.");
        }
        if(marks <= 90 && marks > 80){
            System.out.println("Your grade is B.");
        }
        if(marks <= 80 && marks > 70){
            System.out.println("Your grade is C.");
        }
        if(marks <= 70 && marks > 60){
            System.out.println("Your grade is D.");
        }
        if(marks <= 60 && marks >= 40){
            System.out.println("Your grade is E.");
        }
        if(marks < 40){
            System.out.println("Your grade is F.");
        }
    }
}