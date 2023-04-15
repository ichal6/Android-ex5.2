package pl.lechowicz.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class NotificationReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == "android.provider.Telephony.SMS_RECEIVED") {
            val toast = Toast.makeText(context, "New SMS received!", Toast.LENGTH_SHORT)
            toast.show()
        }
    }

}
