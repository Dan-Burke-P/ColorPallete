package edu.temple.colorpallete;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    public ColorAdapter(ColorObject[] _colorObjects, Context _context, CanvasFragment canvasFragment){
        this.colorObjects = _colorObjects;
        this.context = _context;
        this.canvasFragment = canvasFragment;
        inflater = LayoutInflater.from(context);
    }
    CanvasFragment canvasFragment;
    ColorObject[] colorObjects;
    Context context;
    LayoutInflater inflater;

    @Override
    public int getCount() {
        return colorObjects.length;
    }

    @Override
    public Object getItem(int position) {
        return colorObjects[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.color_layout, null);
        TextView label = convertView.findViewById(R.id.colorLabel);
        final ColorObject co = colorObjects[position];
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canvasFragment.updateColor(co);
            }
        });
        label.setText(co.name);
        convertView.setBackgroundColor(co.color);

        return convertView;
    }
}
