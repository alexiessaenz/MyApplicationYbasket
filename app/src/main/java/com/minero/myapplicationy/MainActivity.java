package com.minero.myapplicationy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button TeamAButton1;
    private Button TeamAButton2;
    private Button TeamAButton3;
    private TextView TextViewA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= (Button) findViewById(R.id.TeamAButton1);
        btn2= (Button) findViewById(R.id.TeamAButton1);
        btn3= (Button) findViewById(R.id.TeamAButton1);
        tv1= (TextView) findViewById(R.id.TextViewA);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(et1.setText( ));
            }
        });

    }
}
