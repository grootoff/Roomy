package com.example.roomy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.SIGN_UP);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitylogin();
            }
        });
        button=findViewById(R.id.LOGIN);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitylog();
            }
        });
    }
    public void openActivitylogin()
    {
        Intent intent=new Intent(MainActivity.this,signup.class);
        startActivity(intent);
    }
    public void openActivitylog()
    {
        Intent intent=new Intent(MainActivity.this,login.class);
        startActivity(intent);
    }
}