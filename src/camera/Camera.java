
package camera;

public class Camera {

    public static void main(String[] args) {
        String[] manufacturers = {"Canon", "Sony", "Nikon"};
        int[][] prices = {{10500, 8500}, {9500, 7200}, {12000, 8000}};

        // Display the Camera Technology Report
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Camera Technology Report");
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-15s%-20s%-20s%n", "Manufacturer", "Mirrorless", "DSLR");
        for (int i = 0; i < manufacturers.length; i++) {
            System.out.printf("%-15sR%-19.2fR%-19.2f%n", manufacturers[i], (double) prices[i][0], (double) prices[i][1]);
        }
        System.out.println("-------------------------------------------------------------------");

        // Display the Camera Technology Result
        System.out.println("Camera Technology Result");
        System.out.println("-------------------------------------------------------------------");
        double maxDifference = 0;
        String manufacturerWithMaxDifference = "";

        for (int i = 0; i < manufacturers.length; i++) {
            double difference = prices[i][0] - prices[i][1];
            System.out.printf("%-15sR%-10.2f", manufacturers[i], difference);

            if (difference >= 2500) {
                System.out.print(" ***");
            }
            System.out.println();

            if (difference > maxDifference) {
                maxDifference = difference;
                manufacturerWithMaxDifference = manufacturers[i];
            }
        }

        System.out.println("\nCamera With The Most Cost Difference: " + manufacturerWithMaxDifference);
        System.out.println("-------------------------------------------------------------------");
    }
}
