package codeclan.com.wordcounterhw.Models;

import java.util.ArrayList;

/**
 * Created by user on 13/11/2017.
 */

public class WordCounter {
    private String[] wordArray;

    public int count(InputString inputString) {
        String inputToCount = inputString.getUserInput();
        wordArray = inputToCount.split(" ");

        return wordArray.length;
    }
}
