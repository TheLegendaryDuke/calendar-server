package com.calendarbook.server

import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.support.GenericApplicationContext
import org.springframework.web.client.RestTemplate
import org.springframework.context.support.beans

val beans = beans {
    bean<RestTemplate>()
}

// See application.properties context.initializer.classes entry
class BeansInitializer : ApplicationContextInitializer<GenericApplicationContext> {
    override fun initialize(context: GenericApplicationContext) =
        beans.initialize(context)
}