package com.example.threebuttonintent;


import static com.example.threebuttonintent.MainActivity.EXTRA_TEXT;
import static com.example.threebuttonintent.MainActivity.EXTRA_TITLE;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    TextView titleView, textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        titleView = findViewById(R.id.title);
        textView = findViewById(R.id.text);

        String title = getIntent().getStringExtra(EXTRA_TITLE);
        String text = getIntent().getStringExtra(EXTRA_TEXT);
        titleView.setText(title);
        textView.setText(text);
    }
}