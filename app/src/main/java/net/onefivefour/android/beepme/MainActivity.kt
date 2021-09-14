package net.onefivefour.android.beepme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import net.onefivefour.android.beepme.screens.create.CreateFragment
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        Timber.d("+++ ON CREATE")
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, CreateFragment.newInstance())
                    .commitNow()
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Timber.d("+++ ON NEW INTENT")
    }
}