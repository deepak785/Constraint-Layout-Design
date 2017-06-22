package com.deepak.david_keshri.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText userInput;
    private EditText userInput2;
    private TextView textView;

    int num,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput=(EditText) findViewById(R.id.editText);
        userInput.setText("");

        userInput2=(EditText) findViewById(R.id.editText2);
        userInput2.setText("");
        textView=(TextView) findViewById(R.id.textView);
          textView.setText("");
        Button button=(Button) findViewById(R.id.button);
        Button button2=(Button) findViewById(R.id.button2);
        Button button3=(Button) findViewById(R.id.button3);
        Button button4=(Button) findViewById(R.id.button4);
        String s=userInput.getText().toString();
        if(s.length()>0)
           num= Integer.parseInt(s);
        String s1=userInput2.getText().toString();
        if(s1.length()>0)
            num2= Integer.parseInt(s1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 textView.setText(Integer.toString(num + num2));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(Integer.toString(num - num2));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(Integer.toString(num*num2));
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(Integer.toString(num / num2));
            }
        });
        

    }
}
