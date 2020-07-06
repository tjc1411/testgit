package com.example.test;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button1);//找到button
        final TextView tv = findViewById(R.id.tv_title);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("I love bytedance");
            }
        });

        Switch sc = (Switch) findViewById(R.id.switch1);
        sc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    tv.setText("bytedance is great");
                } else {
                    tv.setText("Hello World!");
                }
            }
        });

        SeekBar sb=(SeekBar) findViewById(R.id.seekBar);
        final TextView tv2 = findViewById(R.id.textView);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv2.setText("The progress is "+i+"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d("MainActivity", "onStartTrackingTouch");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("MainActivity", "onStopTrackingTouch");
            }
        });

    }
}
