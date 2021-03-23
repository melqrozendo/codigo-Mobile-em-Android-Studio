package com.example.trab3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_CONSOLE_ID = "id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        CervejasDetailFragment frag = (CervejasDetailFragment).getFragmentManager().findFragmentById(R.id.detail_frag);
        int consoleId = (int)getIntent().getExtras().get(EXTRA_CONSOLE_ID);
        frag.setCervejas(consoleId);
    }
}

