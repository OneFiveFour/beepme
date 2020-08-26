package net.onefivefour.android.beepme.startup

import android.content.Context
import androidx.startup.Initializer
import timber.log.Timber

class TimberInit: Initializer<Unit> {
    
    override fun create(context: Context) {
        return Timber.plant(Timber.DebugTree())
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        // No dependencies on other libraries.
        return emptyList()
    }
}