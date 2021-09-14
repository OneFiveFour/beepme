package net.onefivefour.android.beepme.notifications

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import net.onefivefour.android.beepme.screens.create.NotificationReceiver
import timber.log.Timber

object AlarmUtil {

    fun send(context: Context) {

        // Set the alarm for the next seconds.  
        val alarmManager = getAlarmManager(context)
        val pendingIntent = getPendingIntent(context)
        
        alarmManager.setExactAndAllowWhileIdle(
            AlarmManager.RTC_WAKEUP,
            System.currentTimeMillis() + 5000,
            pendingIntent
        )
        
        Timber.d("+++ ALARM SET")
        
    }

    fun cancel(context: Context) {
        val alarmManager = getAlarmManager(context)
        val pendingIntent = getPendingIntent(context)
        
        alarmManager.cancel(pendingIntent)
    }
    
    private fun getPendingIntent(context: Context): PendingIntent {
        val serviceIntent = Intent(context.applicationContext, NotificationReceiver::class.java)
        return PendingIntent.getBroadcast(context, 0, serviceIntent, 0)
    }
    
    private fun getAlarmManager(context: Context): AlarmManager {
        return context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
    }
}