package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button bt;
    private EditText et;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = findViewById(R.id.button);
        et = findViewById(R.id.editTextNumber);
        tv = findViewById(R.id.textView2);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Thank you for using Unit Convertor",Toast.LENGTH_SHORT).show();
                String s = et.getText().toString();
                int a = Integer.parseInt(s);
                double p = 2.205*a;
                tv.setText("The corresponding value in pound is: "+p);
            }
        });
    }
}