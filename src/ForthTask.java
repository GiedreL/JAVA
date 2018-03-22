import java.util.Scanner;

public class ForthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite penkis skaicius");
        int[] mas = new int[5];
        for (int i = 0; i < 5; i++) {
            mas[i] = scanner.nextInt();
        }
        System.out.println("Suma yra :" + masSum(mas));
    }

    private static int masSum(int[] mas) {
        int sum = 0;
        for (Integer m : mas) {
            sum += m;
        }
        return sum;
    }
}

