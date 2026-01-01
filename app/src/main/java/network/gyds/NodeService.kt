package network.gyds

import android.content.Context
import android.content.Intent

object NodeService {
    fun start(context: Context) {
        val intent = Intent(context, LiteNodeService::class.java)
        context.startForegroundService(intent)
    }
}

