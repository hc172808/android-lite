
package network.gyds

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.WebSocket
import okhttp3.WebSocketListener

object MinerWS {

    fun start() {
        val client = OkHttpClient()
        val req = Request.Builder()
            .url("wss://rpc.gyds.network:8546/mine")
            .build()

        client.newWebSocket(req, object : WebSocketListener() {})
    }
}
