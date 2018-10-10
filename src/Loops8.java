public class Loops8 {
    public static void main(String[] args){

        // i)
        for(int i=1; i<=4; i++){
            for(int j=1; j<=10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // ii)
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // iii)
        for(int i=5; i>=1; i--){
            for(int j=1; j<=5; j++){
                if(j<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
