package edu.temple.colorpallete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ColorObject[] colors = {
            new ColorObject("red", Color.RED),
            new ColorObject("blue", Color.BLUE),
            new ColorObject("green", Color.GREEN),
            new ColorObject("black", Color.BLACK),
            new ColorObject("cyan", Color.CYAN),
            new ColorObject("gray", Color.GRAY),
            new ColorObject("yellow", Color.YELLOW),
            new ColorObject("light gray", Color.LTGRAY),
            new ColorObject("magenta", Color.MAGENTA),
            new ColorObject("dark gray", Color.DKGRAY)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ColorAdapter colorAdapter = new ColorAdapter(colors, getApplicationContext());
        GridView gridView = (GridView)findViewById(R.id.colorPallete);
        gridView.setNumColumns(3);
        gridView.setAdapter(colorAdapter);
    }

}