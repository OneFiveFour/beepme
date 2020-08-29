package net.onefivefour.android.beepme

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import timber.log.Timber

class AlarmWorker(val context: Context, val params: WorkerParameters) : Worker(context, params) {
    
    
    override fun doWork(): Result {
        Timber.d("+++ ALARM")
        return Result.success()
    }
}