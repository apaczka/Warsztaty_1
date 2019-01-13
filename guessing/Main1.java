package guessing;

import java.util.Random;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Random random = new Random();
        int guessingNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zgadnij liczbę");
        int number = getNumber(scanner);

        while (number != guessingNumber) {
            if (number > guessingNumber) {
                System.out.println("Za dużo");
                number = getNumber(scanner);
            } else
                System.out.println("za mało");
            number = getNumber(scanner);
        }
        System.out.println("Zgadłeś");
        return;
    }


private static int getNumber (Scanner scanner){
        while(!scanner.hasNextInt()){
            String value = scanner.next();
            System.out.println("wartość "+ value+"nie jest liczbą, podaj liczbę");
        }
        return scanner.nextInt();
}

}
