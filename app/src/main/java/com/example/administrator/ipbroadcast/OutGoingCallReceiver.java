package com.example.administrator.ipbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2016/7/11 0011.
 */
public class OutGoingCallReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        SharedPreferences sp = context.getSharedPreferences("config", 0);
        String number = sp.getString("ipnumber","");

        String currentNumber = getResultData();

        if(currentNumber.startsWith("0")){
            setResultData(number+currentNumber);
        }

    }
}
