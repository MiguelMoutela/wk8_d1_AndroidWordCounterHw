package codeclan.com.wordcounterhw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import codeclan.com.wordcounterhw.Models.InputString;
import codeclan.com.wordcounterhw.Models.WordCounter;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private Button countButton;
    private TextView counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.userInput = (EditText) findViewById(R.id.userInput);
        this.countButton = (Button) findViewById(R.id.button);
        this.counter = (TextView) findViewById(R.id.counter);
    }

    public void onButtonClicked(View button) {
        Log.d("MainActivity", "onButtonClicked");
        String sentence = this.userInput.getText().toString();
        InputString inputString = new InputString(sentence);
        Log.d(getClass().toString(), sentence);
        WordCounter wordCounter  = new WordCounter();
        this.counter.setText(Integer.toString(wordCounter.count(inputString)));
    }

}
