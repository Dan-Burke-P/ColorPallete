package edu.temple.colorpallete;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


public class PaletteFragment extends Fragment {
    private View view;
    private GridView gridView;
    private CanvasFragment canvasFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_palette, container, false);
        gridView = (GridView)view.findViewById(R.id.colorPallete);

        Resources res = this.getResources();
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
        ColorAdapter colorAdapter = new ColorAdapter(colors, getContext(), canvasFragment);
        gridView.setNumColumns(3);

        gridView.setAdapter(colorAdapter);
        return view;
    }

    public void setCanvasFragment(CanvasFragment _canvasFragment){
        canvasFragment = _canvasFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static Fragment newInstance(String name, CanvasFragment _canvasFragment){

        Bundle bundle = new Bundle();
        bundle.putString("NAME", name);
        PaletteFragment fragment = new PaletteFragment();
        fragment.setCanvasFragment(_canvasFragment);
        fragment.setArguments(bundle);
        return fragment;
    }
}