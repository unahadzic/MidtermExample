package org.campus02.collection.lotto;

import java.util.Arrays;

public class LottoZahlenApp {
    public static void main(String[] args) {

        int[] zahlenTipp = generateRandomNumbers(6, 45);

        for (int i : zahlenTipp) {
            System.out.print(i + ", ");
        }
        System.out.println();

        // Alternative Ausgabe von Array wie folgt möglich
        System.out.println("Arrays.toString = "
                + Arrays.toString(zahlenTipp));
    }

    public static int[] generateRandomNumbers(int size, int maxNumber){
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = (int) (Math.random() * maxNumber + 1);
        }
        return result;
    }
}
