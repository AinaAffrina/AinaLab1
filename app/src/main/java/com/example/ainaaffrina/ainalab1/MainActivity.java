package com.example.ainaaffrina.ainalab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    private Button displayButton;
    private EditText etName;
    private TextView tvMessage;
    private Button resetButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayButton = (Button) findViewById(R.id.button);
        etName = (EditText) findViewById(R.id.editText);
        tvMessage = (TextView) findViewById(R.id.textView);
        resetButton = (Button) findViewById(R.id.button2);

    }

    public void displayText (View view)
    {
        String text = etName.getText().toString();
        tvMessage.setText("Welcome " + text);

        Toast toast = makeText(this, "WELCOME " + text, Toast.LENGTH_SHORT);
        toast.show();


    }

    public void resetButton (View view)
    {
        Toast toast = Toast.makeText(this, "Name have been reset", Toast.LENGTH_SHORT);
        toast.show();

        etName.getText().clear();
    }
}
