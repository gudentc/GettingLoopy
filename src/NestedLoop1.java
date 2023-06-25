public class NestedLoop1 {
    public static void main(String[] args) {
        //Declare Variables
        int row;
        int col;
        System.out.println("\nNested Loop");

        for (row = 1; row <= 5; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
