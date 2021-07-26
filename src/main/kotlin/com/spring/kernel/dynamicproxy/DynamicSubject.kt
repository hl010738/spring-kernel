package com.spring.kernel.dynamicproxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

class DynamicSubject(private var sub: Any) : InvocationHandler {

    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {

        println("proxy: ${proxy?.javaClass}")

        println("before: $method")

        method?.invoke(sub, *args.orEmpty())

        println("after: $method")

        return null
    }
}
