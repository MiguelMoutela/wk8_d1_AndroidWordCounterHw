package codeclan.com.wordcounterhw.Models;

/**
 * Created by user on 13/11/2017.
 */

public class InputString {
    private String userInput;

    public InputString(String userInput) {
        this.userInput = userInput;
    }

    public void setUserInput(String text) {
        this.userInput = text;
    }

    public String getUserInput() {
        return userInput;
    }
}

