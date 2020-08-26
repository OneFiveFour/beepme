package net.onefivefour.android.beepme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.onefivefour.android.beepme.screens.create.CreateFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, CreateFragment.newInstance())
                    .commitNow()
        }
    }
}