import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class compareNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        // compare numbers from smallest to largest
        Integer userNumber[] = new Integer[6];
        for (int i = userNumber.length - 1; i >= 0; i--) {
            userNumber[i] = scanner.nextInt();
        }

        scanner.close();

        Arrays.sort(userNumber);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(userNumber));

    }
}
