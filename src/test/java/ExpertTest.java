import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpertTest {

    @Test
    void reverseTestForNothing(){
        // GIVEN
        String string = null;

        // WHEN
        String actual = Expert.reverse(string);

        // THEN
        assertEquals("Die Eingabe darf nicht null sein!", actual);
    }

    @Test
    void reverseTestForOneAlphabet(){
        // GIVEN
        String string = "A";

        // WHEN
        String actual = Expert.reverse(string);

        // THEN
        assertEquals("A", actual);
    }

    @Test
    void reverseTestForManyAlphabets(){
        // GIVEN
        String string = "ABC";

        // WHEN
        String actual = Expert.reverse(string);

        // THEN
        assertEquals("CBA", actual);
    }

    @Test
    void sortAscTest(){
        // GIVEN
        int intArray[] = {6, 2, 8, 3, 9, 6};

        // WHEN
        String actual = Expert.sortAsc(intArray);

        // THEN
        int expectedArray[] = {2, 3, 6, 6, 8, 9};
        assertEquals(Arrays.toString(expectedArray), actual);
    }

    @Test
    void splitStringbyCommaTestforNoComma(){
        // GIVEN
        String myString = "Hallo";

        // WHEN
        String actual = Expert.splitStringbyComma(myString);

        // THEN
        String expectedArray[] = {myString};
        assertEquals(Arrays.toString(expectedArray), actual);
    }

    @Test
    void splitStringbyCommaTestforWithCommas(){
        // GIVEN
        String myString = "Hallo, Ich heiße Joon, wie geht es dir?";

        // WHEN
        String actual = Expert.splitStringbyComma(myString);

        // THEN
        String expectedArray[] = {"Hallo", " Ich heiße Joon", " wie geht es dir?"};
        assertEquals(Arrays.toString(expectedArray), actual);
    }

}
