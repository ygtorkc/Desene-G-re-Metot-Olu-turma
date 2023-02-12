import java.util.Scanner;

public class Main {
    static int subtract(int number){
        System.out.println("Subtracted value:" + (number - 5));
        return number-5;
    }
    static int add(int number){
        System.out.println("Added value:" +(number+5));
        return number+5;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = input.nextInt();
        while(number>0){
            number = subtract(number);
        }
        while (number <= 0) {
            number = add(number);
        }
        }
    }
