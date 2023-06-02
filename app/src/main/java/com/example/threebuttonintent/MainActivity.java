package com.example.threebuttonintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_TITLE = "com.example.android.threebuttonintent.extra.TITLE";
    public static final String EXTRA_TEXT = "com.example.android.threebuttonintent.extra.TEXT";
    Button buttonOne, buttonTwo, buttonThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne = findViewById(R.id.button_text_one);
        buttonTwo = findViewById(R.id.button_text_two);
        buttonThree = findViewById(R.id.button_text_three);

        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button_text_one) {
            launchTextActivity(getString(R.string.text_one_title), getString(R.string.text_one));
        }
        if (view.getId() == R.id.button_text_two) {
            launchTextActivity(getString(R.string.text_two_title), getString(R.string.text_two));
        }
        if (view.getId() == R.id.button_text_three) {
            launchTextActivity(getString(R.string.text_three_title), getString(R.string.text_three));
        }
    }

    private void launchTextActivity(String title, String text) {
        Intent intent = new Intent(MainActivity.this, TextActivity.class);
        intent.putExtra(EXTRA_TITLE, title);
        intent.putExtra(EXTRA_TEXT, text);
        startActivity(intent);
    }

}