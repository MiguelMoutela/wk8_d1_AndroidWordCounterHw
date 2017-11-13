package codeclan.com.wordcounterhw;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.wordcounterhw.Models.InputString;
import codeclan.com.wordcounterhw.Models.WordCounter;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 13/11/2017.
 */

public class WordCounterTest {

    WordCounter wordCounter;
    InputString inputString;

    @Before
    public void before() {
        wordCounter = new WordCounter();
        inputString = new InputString("I add up to six letters");
    }
    @Test
    public void wordCounterCanCount() {
        assertEquals(6, wordCounter.count(inputString));
    }
}
