import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        int number = 0;

        for (int counter = 1; counter <= 10; counter++) {
            System.out.println("Enter integers: ");
            number = input.nextInt();
            if (number > largest)
                largest = number;

        }
        System.out.println("The Largest integer is: " + largest);
    }

}
