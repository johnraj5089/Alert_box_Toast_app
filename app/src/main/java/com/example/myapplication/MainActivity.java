package com.example.myapplication;

import android.content.DialogInterface;
import android.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button closeButton = findViewById(R.id.button);
        Button Next_act = findViewById(R.id.button2);
        builder = new Builder(this);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setTitle(R.string.dialog_title);

                //Setting message manually and performing action on button click
                builder.setMessage("Do you want to close this application ?")
                        .setCancelable(true)
                        .setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                Toast.makeText(getApplicationContext(),"you choose yes action for alert box",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("No", (dialog, id) -> {
                            //  Action for 'NO' Button
                            dialog.cancel();
                            Toast.makeText(getApplicationContext(),"you choose no action for alert box",
                                    Toast.LENGTH_SHORT).show();
                        });
                //Creating dialog box
                //AlertDialog alert = builder.create();
                //Setting the title manually
                //alert.setTitle("Alert");
                //alert.show();
                //shorter code for alert box
                builder.create().show();
            }
        });
        Next_act.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });
    }

}