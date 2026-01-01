
package network.gyds

import okhttp3.OkHttpClient
import okhttp3.Request

object RpcClient {
    private const val RPC_URL = "https://rpc.gyds.network"

    fun connect() {
        val client = OkHttpClient()
        val req = Request.Builder().url(RPC_URL).build()
        client.newCall(req).execute()
    }
}
