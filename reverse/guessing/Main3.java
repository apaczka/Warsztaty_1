package reverse.guessing;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 1000;
        System.out.println("Pomyśl liczbę od 1 do 1000 a ja ją zgadnę w max 10 próbach");

        int n = 10;
        while (n<=10){
        int guess = ((max-min)/2)+min;
        System.out.println("zgaduję "+guess);
        System.out.println("podaj odpowiedź");
        String reply = scanner.nextLine();

        if ("zgadłeś".equals(reply)){
            System.out.println("wygrałem!");
            return;
        }else if ("za dużo".equals(reply)){
            max = guess;
            n--;
        }else if ("za mało".equals(reply)){
            min = guess;
            n--;
        } else{
            System.out.println("Nie oszukuj");
            n--;
        }


        }

    }
}
