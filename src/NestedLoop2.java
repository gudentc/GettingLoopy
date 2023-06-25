public class NestedLoop2 {
    public static void main(String[] args) {
        //Declare Variables
        int row;
        int col;
        System.out.println("\nNested for Loop");

        for (row = 5; row>= 1; row--) {
            for (col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
