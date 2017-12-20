package com.example.android.quizgis;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   RadioButton yes_radio_button, GeographicSystems, basic, Mapped, vector_button;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalculateResults(View view) {

        //Read name
        EditText name = (EditText) findViewById(R.id.ayour_name_view);
        String yourName = name.getText().toString();

        //Question#1
        yes_radio_button = (RadioButton)findViewById(R.id.yes_radio_button);
        if (yes_radio_button.isChecked()){
            score = score + 1;
        }

        //Question#2
        GeographicSystems = (RadioButton)findViewById(R.id.GeographicSystems);
        if (GeographicSystems.isChecked()){
            score = score + 1;
        }

        //Question#3
        basic = (RadioButton)findViewById(R.id.basic);
        if (basic.isChecked()){
            score = score + 1;
        }

        //Question#4
        Mapped = (RadioButton)findViewById(R.id.Mapped);
        if (Mapped.isChecked()){
            score = score + 1;
        }

        //Question#5
        vector_button = (RadioButton)findViewById(R.id.vector_button);
        if (vector_button.isChecked()){
            score = score + 1;
        }

        if (score == 0) {
            Toast.makeText(this, "Dear " + yourName + ", you did " + score + "points. You are a hopeless case!", Toast.LENGTH_SHORT).show();
        }
        if (score == 1 | score == 2) {
            Toast.makeText(this, "Dear " + yourName + ", you did " + score + "points. You're just starting to know the GIS world!", Toast.LENGTH_SHORT).show();
        }
        if (score == 3 | score == 4){
            Toast.makeText(this, "Dear " + yourName + ", you did " + score + "points. You're going so good!", Toast.LENGTH_SHORT).show();
        }
        if (score == 5){
            Toast.makeText(this, "Dear " + yourName + ", you did " + score + "points. Who is the master of GIS? Only you!", Toast.LENGTH_SHORT).show();
        }


    }

}
