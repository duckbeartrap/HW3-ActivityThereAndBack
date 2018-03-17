package com.example.william.thereandback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 10;
    EditText name;
    EditText lastName;
    EditText monthOfBirth;
    EditText season;
    EditText favoriteLecture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    public void init(){

        name = findViewById(R.id.etName);
        lastName = findViewById(R.id.etLastName);
        monthOfBirth = findViewById(R.id.etMonthOfBirth);
        season = findViewById(R.id.etSeason);
        favoriteLecture = findViewById(R.id.etFavoriteLecture);

    }

    public void onClickCalculate(View view) {

        Intent intent = new Intent(this, CalcAct.class);
        intent.putExtra("numOfMonth", Integer.parseInt(monthOfBirth.getText().toString()));
        startActivityForResult(intent, REQUEST_CODE);

    }

    public void onClickDetails(View view) {

        Person person = new Person( name.getText().toString(), lastName.getText().toString(), monthOfBirth.getText().toString(), season.getText().toString(), favoriteLecture.getText().toString() );
        Intent intent = new Intent(this, DetAct.class);
        intent.putExtra("person",person);
        startActivity(intent);

    }

    @Override
    protected void onActivityResult(int reqCode, int resCode, Intent data) {

        super.onActivityResult(reqCode, resCode, data);

        if(reqCode == MainActivity.REQUEST_CODE){
            if(resCode == RESULT_OK){
                season.setText(data.getStringExtra("seasonSubmit"));
            }
        }

    }
}
