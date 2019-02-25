package com.example.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
//public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button actionButton = findViewById(R.id.button);
        actionButton.setOnClickListener(new Toaster());

        //TextView greetingText = (TextView) findViewById(R.id.textView);
        //greetingText.setText(R.string.greetings);
        //CharSequence name //getResources().getString(R.string.hello_world);

    }

    private class Toaster implements View.OnClickListener {
        public void onClick(View v) {
            Toast.makeText(getBaseContext(), getString(R.string.textoToast), Toast.LENGTH_SHORT).show();
        }
    }
}
