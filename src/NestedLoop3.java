public class NestedLoop3 {
    public static void main(String[] args) {
        // Declare variables
        int row;
        int col;
        System.out.println("\nNested for Loop");
        for (row = 1; row <= 5; row++) {
            for (col = 1; col <= 5; col++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
