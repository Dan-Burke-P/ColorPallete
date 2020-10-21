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

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = this.getResources();
        this.setTitle(res.getString(R.string.title_activity_main));

        paletteFragment = PaletteFragment.newInstance("palette fragment");
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.Container_1, paletteFragment).commit();
    }

}