package net.onefivefour.android.beepme.notifications

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.TaskStackBuilder
import net.onefivefour.android.beepme.MainActivity
import net.onefivefour.android.beepme.R

class Creator {

    fun send(context: Context) {

        val notificationId = 1
        val channelId = "channelId"
        val channelName = "channelName"
        val title = "title"
        val content = "content"
        val pendingIntent = getPendingIntent(context)

        val soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)

        // build notification
        val notification = NotificationCompat.Builder(context, channelId)
            .setSmallIcon(R.drawable.logo)
            .setContentTitle(title)
            .setContentText(content)
            .setAutoCancel(true)
            .setSound(soundUri)
            .setContentIntent(pendingIntent)
            .setChannelId(channelId)
            .build()


        val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // ensure notification channel on Oreo+
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_DEFAULT)
            notificationManager.createNotificationChannel(channel)
        }

        notificationManager.notify(notificationId, notification)
    }

    private fun getPendingIntent(context: Context): PendingIntent {
        val resultIntent = Intent(context, MainActivity::class.java)

        val requestCode = 123
        
        return TaskStackBuilder
            .create(context)
            .addNextIntentWithParentStack(resultIntent)
            .getPendingIntent(requestCode, PendingIntent.FLAG_UPDATE_CURRENT) ?: throw IllegalStateException("Could not create Pending Intent for Notification")
    }

}