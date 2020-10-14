package edu.temple.colorpallete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ColorDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_display);
        this.setTitle(getString(R.string.title_activity_color_display));
        Intent intent = getIntent();
        String message = intent.getStringExtra("COLOR");
        TextView textView = findViewById(R.id.ColorName);
        textView.setText(message);

        findViewById(R.id.Background).setBackgroundColor(intent.getIntExtra("COLOR_ID", 1));

    }
}