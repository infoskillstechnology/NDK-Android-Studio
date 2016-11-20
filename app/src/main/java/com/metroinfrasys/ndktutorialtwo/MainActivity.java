package com.metroinfrasys.ndktutorialtwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.ndktext);
        textView.setText(getMsgFromJni());
    }


    static {
        System.loadLibrary("App");
    }
    public native String getMsgFromJni();
}
