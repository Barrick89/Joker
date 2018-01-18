package com.mahausch.activitylibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TextDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_display);

        TextView text = findViewById(R.id.text);
        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");
        text.setText(joke);
    }
}
