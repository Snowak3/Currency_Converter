package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double DOLLAR_TO_POUND_CONVERSION = 0.77;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onConvertButtonClick(View view) {
        EditText inputCurrency = (EditText) findViewById(R.id.input);
        TextView outputCurrency = (TextView) findViewById(R.id.output);

        String dollarCurr = inputCurrency.getText().toString();

        String poundCurr = getCurrencyConversion(dollarCurr);

        outputCurrency.setText(dollarCurr + " dollars is the equivalent of " + poundCurr + " pounds!");
    }

    public String getCurrencyConversion(String init) {
        double dollarAmt = Double.parseDouble(init);

        double poundAmt = dollarAmt * DOLLAR_TO_POUND_CONVERSION;

        return String.valueOf(poundAmt);
    }
}
