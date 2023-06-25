public class InitialT {
    public static void main(String[] args) {
        //Declare Variables
        int row;
        int col;
        System.out.println("\nT for Todd\n");
        //Nested For Loop
        for (row = 2; row <= 10; row++) {
            for (col = 1; col <= 20; col++) {
                if (row <= 3) {
                    System.out.print("*");
                } else if (col <= 8) {
                    System.out.print(" ");
                } else if (col >= 9 && col <= 12) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}
