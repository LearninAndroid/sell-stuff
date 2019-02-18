package dev.mtoto.ecommerce

import android.app.Application
import com.instabug.library.Instabug
import com.instabug.library.invocation.InstabugInvocationEvent

class Commerce : Application() {

    override fun onCreate() {
        super.onCreate()
        Instabug.Builder(this,"dd428d48b1ed06a29c70b648e12ae5b3")
            .setInvocationEvents(InstabugInvocationEvent.SHAKE,InstabugInvocationEvent.SCREENSHOT)
            .build()

    }
}