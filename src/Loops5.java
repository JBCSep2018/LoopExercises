import java.util.Scanner;

public class Loops5 {
    public static void main(String[] args)

    {
        Scanner keyboard = new Scanner(System.in);
        int num;
        System.out.println(" inter number");
        num = keyboard.nextInt();



        for (int i=num; i>=1; i--){
            System.out.println(i);
        }

    }
}
