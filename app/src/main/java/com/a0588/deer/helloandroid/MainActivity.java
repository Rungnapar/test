package com.a0588.deer.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Toast t = Toast.makeText(this , "Hello" , Toast.LENGTH_LONG);
        t.show();

        Toast t1 = Toast.makeText(this ,"",Toast.LENGTH_LONG);
        t1.show();*/

        //--------- ทำให้คลิ๊กได้

        Button btn1 = (Button) findViewById(R.id.button_1);
        Button btn2 = (Button) findViewById(R.id.button_2);
        Button btn3 = (Button) findViewById(R.id.button_3);
        Button btn4 = (Button) findViewById(R.id.button_4);
        Button btn5 = (Button) findViewById(R.id.button_5);
        Button btn6 = (Button) findViewById(R.id.button_6);
        Button btn7 = (Button) findViewById(R.id.button_7);
        Button btn8 = (Button) findViewById(R.id.button_8);
        Button btn9 = (Button) findViewById(R.id.button_9);
        Button btn0 = (Button) findViewById(R.id.button_0);
        //Button btnClaer = (Button) findViewById(R.id.button_clear);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        //btnClaer.setOnClickListener(this);

    }

    //----- สั่งให้ทำงาน เมือ่คลิ๊ก
    @Override
    public void onClick(View v) {
        /*Toast t = Toast.makeText(this,"Deer",Toast.LENGTH_LONG);
        t.show();*/
        TextView textV = (TextView)findViewById(R.id.digit_text_view);
        int id = view.getId();
        String str = "";

        if(this.str.length()!=6) {
            if (id == R.id.button_1) {
                this.str += "1";
                textV.setText(this.str);

            }

    }

}
