package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

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

        // button to increase money
        buttonMakeItRain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

                moneyCounter += 500;

                if (moneyCounter >= 20000) {
                    moneyValue.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.money_full));
                }

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


    // show info button
    public void showInfo(View view) {

//        // Toast
//        Toast.makeText(MainActivity.this, R.string.app_info, Toast.LENGTH_SHORT)
//                .show();

        // Snackbar
        Snackbar.make(moneyValue, R.string.app_info, Snackbar.LENGTH_SHORT)
                // add more button in the snack bar
                .setAction("More", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.d("SnackBar", "More clicked");
                    }
                })
                .show();
    }

}