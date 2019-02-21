package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String name = getResources().getString(R.string.hello_world);
    }

    public void displayToast(View v) {
        Toast.makeText(getBaseContext(),getString(R.string.textoToast),Toast.LENGTH_SHORT).show();
    }
}
