package com.example.william.thereandback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CalcAct extends AppCompatActivity {

    String seasonCalc;
    int monthNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

    }

    public void onClickSubmit(View view) {

        Intent intent  = getIntent();
        monthNum = intent.getIntExtra("numOfMonth" ,MainActivity.REQUEST_CODE);

        if (monthNum%1 == 0 && monthNum <= 12 && monthNum >=1){
            if (monthNum >= 3 && monthNum <= 5){
                seasonCalc = "Spring";
            }
            else if(monthNum >= 6 && monthNum <= 8){
                seasonCalc = "Summer";
            }
            else if(monthNum >= 9 && monthNum <= 11){
                seasonCalc = "Autumn";
            }
            else {
                seasonCalc = "Winter";
            }
        }
        else{
            seasonCalc = "Wrong Number!";
        }

        sendResult();

    }

    public void onClickCancel(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void sendResult(){

        Intent result = new Intent();
        result.putExtra("seasonSubmit",seasonCalc);
        setResult(RESULT_OK,result);
        finish();

    }
}
