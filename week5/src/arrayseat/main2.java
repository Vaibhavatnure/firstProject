package arrayseat;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Reading the input
            int n = Integer.parseInt(scanner.nextLine());
            String[] values = scanner.nextLine().split(" ");

            if (values.length < n) {
                throw new ArrayIndexOutOfBoundsException();
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Integer.parseInt(values[i]);
            }

            System.out.println(sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("list index out of range");
        }
    }
}

