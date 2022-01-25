package com.example.togglebutton_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
private Switch switch1,switch2;
private TextView textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch1=findViewById(R.id.switch1);
        switch2=findViewById(R.id.switch2);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    textView1.setVisibility(View.VISIBLE);
                }else {
                    textView1.setVisibility(View.GONE);

                }
            }
        });
        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    textView2.setVisibility(View.VISIBLE);

                }else {
                    textView2.setVisibility(View.GONE);

                }
            }
        });
    }
}