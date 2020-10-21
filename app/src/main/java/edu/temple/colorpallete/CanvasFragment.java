package edu.temple.colorpallete;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Debug;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CanvasFragment extends Fragment {

    View v;
    TextView t;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_canvas, container, false);
        t = v.findViewById(R.id.ColorDisplay);
        return v;
    }

    public void updateColor(ColorObject colorObject){
        Log.println(Log.ASSERT,"tag", colorObject.name);
        t.setText(colorObject.name);
        v.setBackgroundColor(colorObject.color);
    }
}