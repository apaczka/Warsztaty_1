package lotto.simulator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
       Integer [] tab = generateNumbers();
       Integer [] arr = pickNumbers();
       int score = checkScore(tab, arr);

    }

    private static Integer [] generateNumbers (){
        Integer [] arr = new Integer[49];
        for (int i = 0; i < arr.length; i++) {
            arr [i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
       Collections.shuffle(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
        Integer [] tab = Arrays.copyOfRange(arr,0,6);
        return tab;
    }
    private static Integer [] pickNumbers(){
        Integer [] tab = new Integer [6];
        Scanner scanner = new Scanner (System.in);
        int n =6;
        while (n>0){
            System.out.println("podaj liczbę od 1-49");
            Integer number = getNumber(scanner);
            for (int i = 0; i < tab.length; i++) {
                if(number.equals(tab[i])){

                }

            }
            tab [n-1] = number;
            n--;
                    }
        return tab;
    }
    private static Integer getNumber (Scanner scanner){
        while(!scanner.hasNextInt()){
            String value = scanner.next();
            System.out.println("wartość "+ value+"nie jest liczbą, podaj liczbę");
        }
        return scanner.nextInt();
    }
    private static int checkScore(Integer [] tab, Integer [] arr){
        int counter = 0;
        for (int i = 0; i <tab.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (tab [i].equals(arr[j])){
                    counter++;
                    System.out.println(tab [i]);
                    break;
                }

            }

        }
        return counter;
    }
}
