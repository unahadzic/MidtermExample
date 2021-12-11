package org.campus02.collection.articleapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class EinkaufsListenAppTest
{
    ArrayList<Einkauf> einkaufsliste;
    HashSet<Einkauf> hashSetEinkaufsliste;

    @BeforeEach
    void setUp()
    {
        einkaufsliste = new ArrayList<>();
        einkaufsliste.add(new Einkauf("Brot", 5.00));
        einkaufsliste.add(new Einkauf("Zucker", 3.00));
        einkaufsliste.add(new Einkauf("Zucker", 3.00));

        hashSetEinkaufsliste = new HashSet<>();
        hashSetEinkaufsliste.add(new Einkauf("Brot", 5.00));
        hashSetEinkaufsliste.add(new Einkauf("Zucker", 3.00));
        hashSetEinkaufsliste.add(new Einkauf("Zucker", 3.00));
    }

    @Test
    @DisplayName("SumArrayList-Test")
    void SumArrayList()
    {
        assertEquals(11.0, EinkaufsListenApp.sum(einkaufsliste));
    }

    @Test
    @DisplayName("SumHashSet-Test")
    void SumHastSet()
    {
        assertEquals(8.0, EinkaufsListenApp.sum(hashSetEinkaufsliste));
    }
}