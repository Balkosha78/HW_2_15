package ru.skypro.homework_215.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {
    private final StringListImpl out = new StringListImpl(12);
    private final String[] array = {
            "white", "gray", "black", "green", "round", "square", "round", "oval", "triangle", "ball", "wheel", "brick", "boot"
    };
    @Test
    public void shouldAddAString() {
        String expected = array[0];
        String actual = out.add("white");

        Assertions.assertEquals(expected, actual);

        int sizeExpected = 1;
        int actualSize = out.size();
        Assertions.assertEquals(sizeExpected, actualSize);

        String expected2 = array[1];
        String actual2 = out.add(1, "gray");

        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    public void shouldCorrectlySetElement() {
        out.add(array[0]);

        String expected = array[1];
        String actualSet = out.set(0, array[1]);

        Assertions.assertEquals(expected, actualSet);
    }

    @Test
    public void shouldCorrectlyRemovedElement() {
        out.add(array[1]);
        out.add(array[11]);

        String expected = array[1];
        String actualRemovedString = out.remove(array[1]);

        Assertions.assertEquals(expected, actualRemovedString);

        int sizeExpected = 1;
        int actualSize = out.size();
        Assertions.assertEquals(sizeExpected, actualSize);

        String expectedIndex = array[11];
        String actualRemovedByIndex = out.remove(0);

        Assertions.assertEquals(expectedIndex, actualRemovedByIndex);
    }

    @Test
    public void shouldShowIfContains() {
        boolean expected = true;
        out.add(array[0]);
        out.add(array[3]);
        out.add(array[4]);
        boolean actual = out.contains("round");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCorrectlyReturnIndexOfElement() {
        out.add(array[0]);
        int expectedIfContains = 0;
        int expectedIfDoesntContain = -1;

        int actualContains = out.indexOf(array[0]);
        int actualDoesntContain = out.indexOf(array[1]);

        Assertions.assertEquals(expectedIfContains, actualContains);
        Assertions.assertEquals(expectedIfDoesntContain, actualDoesntContain);
    }


    @Test
    public void shouldCorrectlyReturnLastIndexOfElement() {
        out.add(array[0]);
        out.add(array[3]);
        out.add(array[4]);
        out.add(array[5]);
        out.add(array[6]);

        int expectedIfContains = 4;
        int actualContains = out.lastIndexOf(array[4]);

        Assertions.assertEquals(expectedIfContains, actualContains);
    }

    @Test
    public void shouldCorrectlyGetElement() {
        out.add(array[0]);
        out.add(array[3]);

        String expected = array[3];
        String actual = out.get(1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCorrectlyCompare() {
        out.add(array[0]);
        out.add(array[3]);

        StringListImpl test = new StringListImpl(5);
        test.add(array[0]);
        test.add(array[3]);

        boolean expected = true;
        boolean actual = out.equals(test);

        Assertions.assertEquals(expected, actual);
        test.add(array[5]);

        boolean expectedNotEqual = false;
        boolean actualNotEqual = out.equals(test);

        Assertions.assertEquals(expectedNotEqual, actualNotEqual);
    }

    @Test
    public void shouldReturnActualSize() {
        out.add(array[0]);
        out.add(array[3]);

        int expected = 2;
        int actual = out.size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckIfEmpty() {
        boolean expectedIfEmpty = true;
        boolean actualIfEmpty = out.isEmpty();

        Assertions.assertEquals(expectedIfEmpty, actualIfEmpty);

        out.add(array[12]);

        boolean expectedIfNotEmpty = false;
        boolean actualIfNotEmpty = out.isEmpty();

        Assertions.assertEquals(expectedIfNotEmpty, actualIfNotEmpty);
    }

    @Test
    public void shouldCorrectlyClear() {
        out.add(array[0]);
        out.add(array[3]);

        out.clear();
        boolean expectedIfEmpty = true;
        boolean actualIfEmpty = out.isEmpty();
        Assertions.assertEquals(expectedIfEmpty, actualIfEmpty);
    }

    @Test
    public void shouldReturnArray(){
        out.add(array[0]);
        out.add(array[3]);
        String [] expected = new String[]{array[0], array[3]};
        String[] actual = out.toArray();
        Assertions.assertArrayEquals(expected, actual);

    }
}