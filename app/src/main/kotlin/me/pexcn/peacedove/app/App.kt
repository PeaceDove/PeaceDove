package me.pexcn.peacedove.app

import android.app.Application
import me.pexcn.android.utils.Utils

/**
 * Created by pexcn on 2016-06-29.
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Utils.init(this)
    }
}
