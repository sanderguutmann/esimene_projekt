package com.example.android.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShowPictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_picture);

        Button goBack = (Button) findViewById(R.id.button2);
        goBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }});
    }
}
