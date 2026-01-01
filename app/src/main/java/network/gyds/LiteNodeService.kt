package network.gyds

import android.app.Service
import android.content.Intent
import android.os.IBinder

class LiteNodeService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        RpcClient.connect()
        MinerWS.start()
        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? = null
}
