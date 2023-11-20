import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int passengars = 0;

        System.out.println("Passenger Controller");
        System.out.println(" 1. Clear the boat \n 2. Add 1 to passengers \n 3. remove 1 from passengers \n 4. See Passengars\n 5. End Journey");
        int controll = Sc.nextInt();

        while (controll != 5) {
            System.out.println(
                    " 1. Clear the boat \n 2. Add 1 to passengers \n 3. remove 1 from passengers \n 4. See Passengars  \n 5. End Journey");
            controll = Sc.nextInt();
            Sc.nextLine();

            switch (controll) {
                case 1:
                    passengars = 0;
                    break;
                case 2:
                    passengars += 1;
                    break;

                case 3:
                    if (passengars > 1) {
                        passengars -= 1;
                    } else {
                        System.out.println("No passengers, add some");
                    }
                    break;

                case 4:
                    System.out.println("There are " + passengars + " passengars");
                    break;

                default:
                    break;

            }

        }

        // calculator

        System.out.println("Calculator");
        int calculator = Sc.nextInt();
        int result = 1;

        for (int i = 1; i <= calculator; i++) {
            result *= i;
        }

        System.out.println(result);

        for (int i = 0; i < 5; i++) {
            Sc.nextInt();
        }
    }
}