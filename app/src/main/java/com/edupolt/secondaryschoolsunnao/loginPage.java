package com.edupolt.secondaryschoolsunnao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class loginPage extends AppCompatActivity {

    Button callsignup, loginup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        Intent caller = getIntent();

        callsignup = findViewById(R.id.new_user);
        loginup = findViewById(R.id.loginbutton);
        loginup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "WRONG : Username  OR Password",
                        Toast.LENGTH_SHORT).show();
            }
        });
        callsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginPage.this, signup_page.class);
                startActivity(intent);
            }
        });
    }
}
