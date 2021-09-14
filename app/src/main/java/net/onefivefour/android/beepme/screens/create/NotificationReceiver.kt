package net.onefivefour.android.beepme.screens.create

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import timber.log.Timber

class NotificationReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        
        Timber.d("+++ ON RECEIVE")
        
    }
}