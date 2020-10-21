package edu.temple.colorpallete;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Fragment paletteFragment;
    private CanvasFragment canvasFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = this.getResources();
        this.setTitle(res.getString(R.string.title_activity_main));

        canvasFragment = new CanvasFragment();
        paletteFragment = PaletteFragment.newInstance("palette fragment", canvasFragment);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.Container_1, paletteFragment)
                .replace(R.id.Container_2, canvasFragment)
                .commit();
    }

}