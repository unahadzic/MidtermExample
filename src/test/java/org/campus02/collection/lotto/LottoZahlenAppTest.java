package org.campus02.collection.lotto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LottoZahlenAppTest
{
    @Test
    @DisplayName("generateRandomNumbers-Test")
    void generateRandomNumbersTest()
    {
        int[] numbers = LottoZahlenApp.generateRandomNumbers(6,45);
        int maxNumber = 0;
        for (int number : numbers)
        {
            if (number > maxNumber)
            {
                maxNumber = number;
            }
            assertTrue(numbers.length == 6 && maxNumber <= 45);
        }
    }
}