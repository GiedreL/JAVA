import java.util.Arrays;
import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite penkis zodzius");
        String [] mas5 = new String[5];
        for (int i=0; i<mas5.length; i++){
            mas5[i] = scanner.nextLine();

        }
        System.out.println(Arrays.toString(mas5));

    }
}
