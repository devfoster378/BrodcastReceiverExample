package com.devfoster.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class TimeZoneChangedReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val actionString = intent!!.action
        Log.i("Timezone", actionString.toString())
        Toast.makeText(context, actionString, Toast.LENGTH_LONG).show()
    }
}