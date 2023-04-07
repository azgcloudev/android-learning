package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonMakeItRain;
    private Button buttonShowInfo;
    private TextView moneyValue;
    private int moneyCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMakeItRain = findViewById(R.id.btnMakeItRain);
        moneyValue = findViewById(R.id.moneyValue);

        buttonMakeItRain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

                moneyCounter += 21;
                moneyValue.setText(String.valueOf(numberFormat.format(moneyCounter)));
                // log messages in android studio
                Log.d("MainActivity", "onClick: Make it rain " + moneyCounter);
            }
        });


    }

    // another option to make actions based on clicks, see the activity_main xml button details
    //    public void showMoney(View view) {
    //        Log.d("MainActivity", "onClick: Make it rain" );
    //    }

}