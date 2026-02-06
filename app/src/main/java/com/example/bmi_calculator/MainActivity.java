package com.example.bmi_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText n1;

    EditText n2;

    Button calcbutt;

    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        n1 = findViewById(R.id.txtnum1);
        n2 = findViewById(R.id.txtnum2);
        calcbutt = findViewById(R.id.calcbutt);
        display = findViewById(R.id.bmiResult);
        calcbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String heightstr = n1.getText().toString();
                String weightstr = n2.getText().toString();

                if (weightstr.isEmpty() || heightstr.isEmpty()){
                    Toast.makeText(MainActivity.this,
                            "Please enter both weight and height",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                try {
                    float height = Float.parseFloat(heightstr)/100;
                    float weight = Float.parseFloat(weightstr);
                    float bmi = weight / (height * height);

                    String result = String.format("Your BMI: %.1f -",bmi);
                    if (bmi < 18.5){
                        result += "underweight";
                    }else if (bmi < 25){
                        result += "Normal weight";
                    } else if (bmi < 30){
                        result += "Overweight";
                    }else {
                        result += "Obese";
                    }

                    display.setText(result);
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this,
                            "Please enter valid numbers",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}