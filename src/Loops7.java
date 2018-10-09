import java.util.Scanner;

public class Loops7 {
    public static void main(String[] args){

        Scanner keyword = new Scanner(System.in);
        System.out.println("Enter number: ");
        int input = keyword.nextInt();
        int sum = 0;

        // forwards adding 1-input
        for(int i = 1; i <= input; i++){
            sum = sum + i;
            System.out.println(sum);
        }

        sum = 0;

        // backwards adding input-1
        for(int i=input; i>=1; i--){
            sum = sum + i;
            System.out.println(sum);
        }
    }
}
