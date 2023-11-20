import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class calculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // compare numbers from largest to smallest.
        Integer userNumber[] = new Integer[6];
        for (int i = userNumber.length - 1; i >= 0; i--) {
            userNumber[i] = scanner.nextInt();
        }

        // Closing the Scanner to prevent resource leak
        scanner.close();

        Arrays.sort(userNumber);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(userNumber));

        Arrays.sort(userNumber, Collections.reverseOrder());
        System.out.println("Sorted array in descending order: " + Arrays.toString(userNumber));
    }
}
