import java.util.Scanner;

public class SecondTask {
    private static final int MAX_NUMB = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite kiek skaiciu noresite uzpildyti");

        int kiek = sc.nextInt();

        int [] mas = new int[kiek];

        for(int i = 0; i < kiek; i++){
            System.out.println("Iveskite " + i + " skaicius");
            mas[i] = sc.nextInt();
        }
        printMas(mas);
    }
    private static void printMas(int[] skMas){
        for (Integer sk : skMas){
            if (sk >= MAX_NUMB){
                System.out.println(sk);
            }
        }
    }
}
