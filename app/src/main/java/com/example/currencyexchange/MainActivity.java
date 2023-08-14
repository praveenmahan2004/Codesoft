package com.example.currencyexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText dollar = findViewById(R.id.editText);
        TextView btc = findViewById(R.id.textView);
        Button result=findViewById(R.id.convert);



        result.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View){
                String doll= dollar.getText().toString();
                float dollarconvert=Float.parseFloat(doll);
                double converted = (dollarconvert * 29908.9);
                btc.setText("BTC ="+converted+"$");
            }
        });



    }
}