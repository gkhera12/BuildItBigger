package com.example.eightleaves.jokeviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_view);
        TextView jokeTextView = (TextView) findViewById(R.id.joke_view);
        Intent intent = getIntent();
        jokeTextView.setText(intent.getExtras().getString(Intent.EXTRA_TEXT));
    }
}
