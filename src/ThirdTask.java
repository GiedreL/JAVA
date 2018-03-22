import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sk = 0;
        int kiek = 0;
        int[] mas = {};

        do {
            System.out.println("Iveskite skaicius, kol bus ivestas 0");
            try {
                sk = scanner.nextInt();

                if (mas.length <= kiek) {
                    mas = Arrays.copyOf(mas, mas.length + 1);
                }
                mas[kiek++] = sk;
            } catch (InputMismatchException e) {
                System.out.println("Blogai ivestas skaicius, programa baigia darba");
                scanner.nextLine();
                // arba galimas sk = 0  tada ivedus bloga simboli baigs darba
            }

        } while (sk != 0);

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
