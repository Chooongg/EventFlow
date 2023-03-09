package com.chooongg.eventFlow

import android.app.Application
import android.content.Context
import androidx.startup.Initializer

class EventFlowInitializer : Initializer<String> {
    override fun create(context: Context): String {
        ApplicationScopeViewModelProvider.init(context as Application)
        return "EventFlow is initialized"
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf()
}