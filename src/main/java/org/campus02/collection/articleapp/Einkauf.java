package org.campus02.collection.articleapp;

import java.util.Objects;

public class Einkauf {
    private String articleName;
    private double preis;

    public Einkauf(String articleName, double preis) {
        this.articleName = articleName;
        this.preis = preis;
    }

    public String getArticleName() {
        return articleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Einkauf einkauf = (Einkauf) o;
        return Double.compare(einkauf.preis, preis) == 0 && Objects.equals(articleName, einkauf.articleName);
    }

    @Override
    public int hashCode() {
        // HashCode wird über ArticleName und Preis gebildet
        return Objects.hash(articleName, preis);
    }

    public double getPreis() {
        return preis;
    }

    @Override
    public String toString() {
        return "Einkauf{" +
                "articleName='" + articleName + '\'' +
                ", preis=" + preis +
                '}';
    }
}
