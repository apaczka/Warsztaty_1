package qubes;

import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        System.out.println(simulate("3D6-10"));

    }

    private static int simulate(String code) {
        int result = 0;

        int index = code.indexOf("D");
        int signIndex = 0;
        int sort = 0;
        int numberOfTry = 0;
        int add = 0;
        String sign = "";

        if (code.contains("+")) {
            signIndex = code.indexOf("+");
        }else if (code.contains("-")){
            signIndex = code.indexOf("-");

        } else {
            signIndex = code.length() - 1;

        }

        if (code.contains("+")) {
            sign = "+";
        } else if (code.contains("-")){
            sign = "-";

            } else {
            sign = "";
        }

        if (index == 0) {
            sort = Integer.parseInt(code.substring(index + 1, signIndex));

        } else
            numberOfTry = Integer.parseInt(code.substring(0, index));
        sort = Integer.parseInt(code.substring(index + 1, signIndex));

        if (signIndex != code.length() - 1) {
            add = Integer.parseInt(code.substring(signIndex));

        }

        Random random = new Random();
        int trial = random.nextInt(sort) + 1;
        System.out.println(trial);

        if (index == 0) {
            result = trial+add;
        } else {
            result = numberOfTry*trial+add;
        }

        return result;
    }
}
