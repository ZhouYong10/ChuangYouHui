package com.chuangyouclub.chuangyouhui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn_log_in = (Button) findViewById(R.id.log_in);
        TextView btn_log_up = (TextView) findViewById(R.id.log_up);

        btn_log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, NavActivity.class);
                startActivity(intent);
            }
        });

        btn_log_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, LogupActivity.class);
                startActivity(intent);
            }
        });
    }
}
