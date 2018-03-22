package ThirdClass;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine() ;
        boolean polindr = true;

        for (int i= 0; i<word.length();i++ ){
            char pradzia = word.charAt(i);
            char galas = word.charAt(word.length()-1 -i);

            if(word.charAt(i) != word.charAt(word.length()-1 -i)){
                System.out.println("Ivestas zodis nera polindromas");
                polindr = false;
                break;
            }
        }
        if (polindr){
            System.out.println("Ivestas zodis " + word + " yra polindromas");
        }
    }
}
