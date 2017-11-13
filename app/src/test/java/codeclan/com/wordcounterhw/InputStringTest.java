package codeclan.com.wordcounterhw;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.wordcounterhw.Models.InputString;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 13/11/2017.
 */

public class InputStringTest {

    InputString inputString;

    @Before
    public void before() {
        inputString = new InputString("I have four letters");
    }
    @Test
    public void counterCanSetUserInput() {
        inputString.setUserInput("This is a string");
        assertNotNull(inputString.getUserInput());
        assertEquals("This is a string",inputString.getUserInput());
    }
}
