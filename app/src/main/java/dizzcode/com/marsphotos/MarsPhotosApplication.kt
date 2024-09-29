package dizzcode.com.marsphotos

import android.app.Application
import dizzcode.com.marsphotos.data.AppContainer
import dizzcode.com.marsphotos.data.DefaultAppContainer

class MarsPhotosApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
