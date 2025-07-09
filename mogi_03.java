import java.util.Scanner;
public class mogi_03 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;  // Set the value of Pi

        System.out.println("Enter a process number (1-4):");
        int processNumber = scanner.nextInt();  // Read process number from the user

        switch (processNumber) {
            case 1:
                // Calculate the area of a circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double areaOfCircle = radius * radius * PI;
                System.out.printf("Area of the circle: %.2f\n", areaOfCircle);
                break;

            case 2:
                // Find the volume of a cylinder
                System.out.print("Enter the radius of the base of the cylinder: ");
                radius = scanner.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double height = scanner.nextDouble();
                double volumeOfCylinder = radius * radius * PI * height;
                System.out.printf("Volume of the cylinder: %.2f\n", volumeOfCylinder);
                break;

            case 3:
                // Find the area of a triangle
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                height = scanner.nextDouble();
                double areaOfTriangle = (base * height) / 2;
                System.out.printf("Area of the triangle: %.2f\n", areaOfTriangle);
                break;

            case 4:
                // Find the area of a rhombus
                System.out.print("Enter the length of the first diagonal of the rhombus: ");
                double diagonal1 = scanner.nextDouble();
                System.out.print("Enter the length of the second diagonal of the rhombus: ");
                double diagonal2 = scanner.nextDouble();
                double areaOfRhombus = (diagonal1 * diagonal2) / 2;
                System.out.printf("Area of the rhombus: %.2f\n", areaOfRhombus);
                break;

            default:
                // Display error message for invalid process number
                System.out.println("Input number error");
                break;
        }

        scanner.close();  // Close the scanner object to prevent resource leaks
    }
}