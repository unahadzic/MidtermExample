package org.campus02.collection.articleapp;

import java.util.ArrayList;
import java.util.HashSet;


public class EinkaufsListenApp {
    public static void main(String[] args) {

        ArrayList<Einkauf> einkaufsliste = new ArrayList<>();
        einkaufsliste.add(new Einkauf("Milch", 1.79));
        einkaufsliste.add(new Einkauf("Brot", 3.2));
        einkaufsliste.add(new Einkauf("Milch", 1.79));

        System.out.println("sum(einkaufsliste) = " + sum(einkaufsliste));
        HashSet<Einkauf> unique = unique(einkaufsliste);
        System.out.println("unique = " + unique); // Dafür muss noch toString() in Einkauf erstellt werden
        System.out.println("sum(unique) = " + sum(unique));


    }

    public static double sum(ArrayList<Einkauf> einkaufsListe) {
        double sum = 0;
        for (Einkauf einkauf : einkaufsListe) {
            sum += einkauf.getPreis();
        }
        return sum;
    }

    public static HashSet<Einkauf> unique(ArrayList<Einkauf> einkaufsliste) {
        HashSet<Einkauf> set = new HashSet<>();
        set.addAll(einkaufsliste);
        // addAll kann anstatt einer Schleife und Einzelaufrufen von add() verwendet werden
        return set;
    }

    public static double sum(HashSet<Einkauf> set){
        double sum = 0;
        for (Einkauf einkauf : set) {
            sum += einkauf.getPreis();
        }
        return sum;
    }
}
