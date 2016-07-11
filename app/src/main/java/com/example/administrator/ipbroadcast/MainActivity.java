package com.example.administrator.ipbroadcast;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {

    private EditText et_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_number = (EditText) findViewById(R.id.et_number);
    }

    public void click(View v){
        String number = et_number.getText().toString().trim();

        SharedPreferences sp =  getSharedPreferences("config",0);

        sp.edit().putString("ipnumber",number).commit();
        Toast.makeText(getApplicationContext(),"保存成功",Toast.LENGTH_SHORT).show();
    }
}
