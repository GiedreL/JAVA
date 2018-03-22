import java.util.Scanner;

public class PagrindaiFirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Iveskite zodi, jei norite baigti, iveskite PABAIGA");
            String word = scanner.nextLine();
            if (word.toLowerCase().equals("pabaiga")) {
                break;
            }
            if (word.length() % 2 == 0) {
                System.out.println("Ivestas zodis " + word + " yra lyginis, jo ilgis yra:" + word.length());
            } else {
                System.out.println("Zodis " + word + " yra nelyginis, jo ilgis " + word.length());
            }
            char letter = 'a';
            System.out.println("Radome " + letter + " raidziu " + countHowManyLettersHaveWord(word, letter));
        }
    }
    private static int countHowManyLettersHaveWord(String word, char letter){
        int count = 0;

        for(int i = 0; i< word.length(); i++){
            if(word.charAt(i) == letter){
                count++;
            }
        }

        return count;
    }
}
