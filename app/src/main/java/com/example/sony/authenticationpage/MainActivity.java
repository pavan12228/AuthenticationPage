package com.example.sony.authenticationpage;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSingup,btnLogin;
    LinearLayout layout_2,layout_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin= (Button) findViewById(R.id.btn_login);
        btnSingup= (Button) findViewById(R.id.btn_signup);
        layout_2= (LinearLayout) findViewById(R.id.layout_2);
        layout_3= (LinearLayout) findViewById(R.id.layout_3);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "hello from login page", Toast.LENGTH_SHORT).show();
                layout_3.setVisibility(View.VISIBLE);
                layout_2.setVisibility(View.GONE);
                btnLogin.setBackgroundColor(Color.parseColor("#f50658"));

                btnSingup.setBackgroundColor(Color.parseColor("#d1cfcf"));

            }
        });



        btnSingup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "hello from singnup page", Toast.LENGTH_SHORT).show();

                layout_3.setVisibility(View.INVISIBLE);
                layout_2.setVisibility(View.VISIBLE);
                btnSingup.setBackgroundColor(Color.parseColor("#f50658"));
                btnLogin.setBackgroundColor(Color.parseColor("#d1cfcf"));

            }
        });

    }





}
