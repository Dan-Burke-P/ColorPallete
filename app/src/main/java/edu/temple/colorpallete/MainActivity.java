package edu.temple.colorpallete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = this.getResources();
        this.setTitle(res.getString(R.string.title_activity_main));
        ColorObject[] colors = {
                new ColorObject(res.getString(R.string.red), Color.RED),
                new ColorObject(res.getString(R.string.blue), Color.BLUE),
                new ColorObject(res.getString(R.string.green), Color.GREEN),
                new ColorObject(res.getString(R.string.black), Color.BLACK),
                new ColorObject(res.getString(R.string.cyan), Color.CYAN),
                new ColorObject(res.getString(R.string.gray), Color.GRAY),
                new ColorObject(res.getString(R.string.yellow), Color.YELLOW),
                new ColorObject(res.getString(R.string.light_gray), Color.LTGRAY),
                new ColorObject(res.getString(R.string.magenta), Color.MAGENTA),
                new ColorObject(res.getString(R.string.dark_gray), Color.DKGRAY)
        };
        ColorAdapter colorAdapter = new ColorAdapter(colors, getApplicationContext());
        GridView gridView = (GridView)findViewById(R.id.colorPallete);
        gridView.setNumColumns(3);

        gridView.setAdapter(colorAdapter);
    }

}