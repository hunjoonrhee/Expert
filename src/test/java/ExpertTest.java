import org.junit.jupiter.api.Test;

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


}
