package com.example.lab_radiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Step 1 - local instances
    RadioButton rbGold, rbPrime, rbGuest;
    RadioGroup radioGroup;
    Button btnSubmit;
    String selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 2 - binding views
        rbGold = findViewById(R.id.rb1);
        rbPrime = findViewById(R.id.rb2);
        rbGuest = findViewById(R.id.rb3);
        btnSubmit = findViewById(R.id.btnSubmit);
        radioGroup = findViewById(R.id.radioGroup);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                switch (selectedId){
                    case R.id.rb1:
                        Toast.makeText(MainActivity.this,
                                rbGold.getText().toString()+" is selected",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb2:
                        Toast.makeText(MainActivity.this,
                                rbPrime.getText().toString()+" is selected",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb3:
                        Toast.makeText(MainActivity.this,
                                rbGuest.getText().toString()+" is selected",
                                Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "nothing selected", Toast.LENGTH_SHORT).show();

                }

            }
        });


    }
}