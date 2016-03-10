package com.example.goncalopinto.labex3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Goncalo Pinto on 10/03/2016.
 */
public class MyPhoneReceiver extends BroadcastReceiver{


    @Override
    public void onReceive(Context context, Intent intent) {
        String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
        System.out.println("---------------->>>>>>>>>>>>>>>>>>> Phone state changed to " + state);


        if (TelephonyManager.EXTRA_STATE_RINGING.equals(state))
       {
           String incomingNumber = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
           System.out.println("Phone state changed to " + state);
       }


    }
}