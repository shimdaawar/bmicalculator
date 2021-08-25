package com.example.bmical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText weight;
    public EditText height;
    public Button btn;
    public TextView result;
    public TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight=(EditText)findViewById(R.id.etweight);
        height=(EditText)findViewById(R.id.etheight);
        btn=(Button)findViewById((R.id.btnbmi));
        result=(TextView)findViewById(R.id.rbmi);
        show=(TextView)findViewById(R.id.sbmi);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1=Double.parseDouble(weight.getText().toString());
                double num2=Double.parseDouble(height.getText().toString());
                num2/=100;
                double bmical=num1/Math.pow(num2,2);
                if(bmical<18.5)
                {
                    result.setText("UNDERWEIGHT");
                    show.setText("BMI=" + String.valueOf(bmical));

                }
                else if(bmical>=18.5 && bmical<=24.9)
                {
                    result.setText("NORMAL");
                    show.setText("BMI=" + String.valueOf(bmical));
                }
                else if(bmical>=25 && bmical<=29.9)
                {
                    result.setText("OVERWEIGHT");
                    show.setText("BMI=" + String.valueOf(bmical));
                }
                else
                {
                    result.setText("OBSESITY");
                    show.setText("BMI=" + String.valueOf(bmical));
                }

            }
        });

    }
}