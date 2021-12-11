package org.campus02.oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoAppTest
{
    Person Una;

    @BeforeEach
    void setUp()
    {
        Una = new Person("Una", "Hadzic",168, (byte)2);
    }

    @Test
    @DisplayName("rechneBMI-Test")
    void rechneBMITest()
    {
        assertEquals("Normalgewicht", Una.rechneBMI(70));
    }
}