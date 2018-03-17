package com.example.william.thereandback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetAct extends AppCompatActivity {

    TextView name;
    TextView lastName;
    TextView monthOfBirth;
    TextView season;
    TextView favoriteLecture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_det);

        init();

        Intent intent = getIntent();
        Person person = (Person)intent.getSerializableExtra("person");

        name.setText(person.getName());
        lastName.setText(person.getLastname());
        monthOfBirth.setText(person.getMonth());
        season.setText(person.getSeason());
        favoriteLecture.setText(person.getFavorite());

    }

    public void init(){

        name = findViewById(R.id.tvName);
        lastName = findViewById(R.id.tvLastName);
        monthOfBirth = findViewById(R.id.tvMonthOfBirth);
        season = findViewById(R.id.tvSeason);
        favoriteLecture = findViewById(R.id.tvFavoriteLecturer);


    }
}
