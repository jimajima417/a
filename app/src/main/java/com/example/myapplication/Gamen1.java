package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Gamen1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamen1);

        Button endButton = findViewById(R.id.back);
        endButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
    }
});
    }
}
