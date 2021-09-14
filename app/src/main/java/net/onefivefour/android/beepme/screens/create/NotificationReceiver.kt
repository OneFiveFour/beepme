package net.onefivefour.android.beepme.screens.create

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import net.onefivefour.android.beepme.notifications.AlarmUtil
import timber.log.Timber

class NotificationReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        
        Timber.d("+++ RECREATE ALARM")
        
        AlarmUtil.send(context)
        
    }
}