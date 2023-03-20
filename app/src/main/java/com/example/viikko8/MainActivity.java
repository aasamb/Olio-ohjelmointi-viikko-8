package com.example.viikko8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText numberInput;
    private EditText numberInput2;
    private TextView numberOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = findViewById(R.id.insertNumber);
        numberInput2 = findViewById(R.id.insertNumber2);
        numberOutput = findViewById(R.id.outputValue);
    }

    public void add(View view)  {
        //System.out.println("add-metodissa ollaan"); //Aputulostuksia vain.

        try {
            float num1 = Float.parseFloat(numberInput.getText().toString());
            float num2 = Float.parseFloat(numberInput2.getText().toString());
            //System.out.println("Luvut tallennettu."); //Aputulostuksia vain.
            float answer = num1 + num2;
            numberOutput.setText(answer == (int) answer ? String.valueOf((int) answer) : String.valueOf(answer));

        }   catch(NumberFormatException n)    {
            // System.out.println(n.toString());
            Toast.makeText(this, "Anna molemmat luvut", Toast.LENGTH_LONG).show();
        }
    }

    public void subtract(View view)  {
        //System.out.println("substract-metodissa ollaan"); //Aputulostuksia vain.

        try {
            float num1 = Float.parseFloat(numberInput.getText().toString());
            float num2 = Float.parseFloat(numberInput2.getText().toString());
            //System.out.println("Luvut tallennettu."); //Aputulostuksia vain.
            float answer = num1 - num2;
            numberOutput.setText(answer == (int) answer ? String.valueOf((int) answer) : String.valueOf(answer));

        }   catch(NumberFormatException n)    {
            // System.out.println(n.toString());
            Toast.makeText(this, "Anna molemmat luvut", Toast.LENGTH_LONG).show();
        }
    }

    public void multiply(View view)  {
        //System.out.println("multiply-metodissa ollaan"); //Aputulostuksia vain.

        try {
            float num1 = Float.parseFloat(numberInput.getText().toString());
            float num2 = Float.parseFloat(numberInput2.getText().toString());
            // System.out.println("Luvut tallennettu."); //Aputulostuksia vain.
            float answer = num1 * num2;
            numberOutput.setText(answer == (int) answer ? String.valueOf((int) answer) : String.valueOf(answer));

        }   catch(NumberFormatException n)    {
            // System.out.println(n.toString());
            Toast.makeText(this, "Anna molemmat luvut", Toast.LENGTH_LONG).show();
        }
    }

    public void divide(View view)  {
        //System.out.println("divide-metodissa ollaan"); //Aputulostuksia vain.

        try {
            float num1 = Float.parseFloat(numberInput.getText().toString());
            float num2 = Float.parseFloat(numberInput2.getText().toString());
            //System.out.println("Luvut tallennettu."); //Aputulostuksia vain.
            if (num2 != 0) {
                float answer = num1 / num2;
                numberOutput.setText(answer == (int) answer ? String.valueOf((int) answer) : String.valueOf(answer));
            }   else {
                Toast.makeText(this, "Nollalla ei voi jakaa", Toast.LENGTH_LONG).show();

            }

        }   catch(NumberFormatException n)    {
            // System.out.println(n.toString());
            Toast.makeText(this, "Anna molemmat luvut", Toast.LENGTH_LONG).show();
        }
    }
}