package net.onefivefour.android.beepme.notifications

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.SystemClock
import net.onefivefour.android.beepme.MainActivity
import timber.log.Timber

class Creator {

    fun send(context: Context) {

        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as? AlarmManager
        val alarmIntent = Intent(context, MainActivity::class.java).let { intent ->
            PendingIntent.getBroadcast(context, 0, intent, 0)
        }
        
        Timber.d("+++ SET ALARM")

        alarmManager?.set(
            AlarmManager.ELAPSED_REALTIME_WAKEUP,
            SystemClock.elapsedRealtime() + 30 * 1000,
            alarmIntent
        )
    }
}