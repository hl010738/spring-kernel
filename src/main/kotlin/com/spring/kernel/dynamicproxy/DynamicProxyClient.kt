package com.spring.kernel.dynamicproxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy

fun main() {
    val realSubject = RealSubject()

    val invocationHandler: InvocationHandler = DynamicSubject(realSubject)

    val classType = invocationHandler.javaClass

    val subject: Subject = Proxy.newProxyInstance(classType.classLoader,
        realSubject.javaClass.interfaces, invocationHandler) as Subject

    subject.doSomething()
}
