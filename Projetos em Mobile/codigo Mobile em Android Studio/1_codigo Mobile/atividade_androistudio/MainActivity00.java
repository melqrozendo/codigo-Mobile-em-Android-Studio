package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        group.setOnCheckedChangerListener(new RadioGroup.OnCheckedChangeListener()
                public void onCheckedChanged(RadioGroup group, int checkedId){
            boolean sim = R.id.radioSim == checkedId;
            boolean nao = R.id.radioNao == checkedId;
            if (sim){
                Log.i(TAG, "marcou sim: " + checkedId);
            } else if (nao) {
                Log.i(TAG, "marcou nao: " + checkedId);
            }
        }
    });
        CheckBox check = findViewById(R.id.checkReceberEmail);

        check.setOnCheckedListener(new CheckBox.OnCheckedChangeListener()
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                    Log.i(TAG, "Check: " + isChecked);
                });
}
