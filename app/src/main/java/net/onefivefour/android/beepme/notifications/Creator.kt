package net.onefivefour.android.beepme.notifications

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.SystemClock
import net.onefivefour.android.beepme.MainActivity
import net.onefivefour.android.beepme.screens.create.NotificationReceiver
import timber.log.Timber

object Creator {

    fun send(context: Context) {

        // Init the Alarm Manager.
        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager

        // Setting the PendingIntent to be fired when alarm triggers.
        val serviceIntent = Intent(context.applicationContext, NotificationReceiver::class.java)
        val pendingServiceIntent = PendingIntent.getBroadcast(context, 0, serviceIntent, 0)

        // Set the alarm for the next seconds.  
        alarmManager.setExactAndAllowWhileIdle(
            AlarmManager.RTC_WAKEUP,
            System.currentTimeMillis() + 5000,
            pendingServiceIntent
        )
        
        Timber.d("+++ ALARM SET")
        
    }
}