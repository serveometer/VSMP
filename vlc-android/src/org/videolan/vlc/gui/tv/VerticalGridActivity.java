package org.videolan.vlc.gui.tv;

import org.videolan.vlc.R;

import android.app.Activity;
import android.os.Bundle;

public class VerticalGridActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tv_vertical_grid);
        getWindow().setBackgroundDrawableResource(R.drawable.background);
    }
}
