package com.example.brodcastreciverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class ConnectivityChangeReciver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.

        Log.e("Tag","onReceived..............")
        val newActivity=Intent(context,RecivedActivity::class.java)
        context.startActivity(newActivity)
    }
}
