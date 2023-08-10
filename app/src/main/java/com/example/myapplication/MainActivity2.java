package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        addListenerOnButton();
    }
    public void addListenerOnButton(){
        EditText edittext = findViewById(R.id.editText1);
        EditText edittext2 = findViewById(R.id.editText2);
        Button button = findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val1 = edittext.getText().toString();
                String val2 = edittext2.getText().toString();
                int a = Integer.parseInt(val1);
                int b = Integer.parseInt(val2);
                int sum = a+b;
                Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG).show();

            }
        });
    }
}
