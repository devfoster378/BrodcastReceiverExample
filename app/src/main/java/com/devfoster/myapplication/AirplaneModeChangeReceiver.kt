 package com.devfoster.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

//AirplaneModeChangeReceiver class extending BroadcastReceiver class
class AirplaneModeChangeReceiver: BroadcastReceiver() {

    // this function will be excecuted when the user changes his
    // airplane mode
    override fun onReceive(context: Context?, intent: Intent?) {

        // intent contains the information about the broadcast
        // in our case broadcast is change of airplane mode

        // if getBooleanExtra contains null value,it will directly return back
        val isAirPlaneModeEnabled = intent?.getBooleanExtra("state", false)

        // checking whether airplane mode is enabled or not
        if (isAirPlaneModeEnabled!!){
            // showing the toast message if airplane mode is enabled
            Toast.makeText(context, "Airplane Mode Enabled", Toast.LENGTH_LONG).show()
            Log.e("context", "Airplane Mode Enabled")
        }else{
            // showing the toast message if airplane mode is disabled
            Toast.makeText(context, "Airplane Mode Disabled", Toast.LENGTH_LONG).show()
            Log.e("context", "Airplane Mode Disabled")
        }
    }
}