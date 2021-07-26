package com.spring.kernel.proxy

class ProxyClient {
}

fun main() {
    val target = ProxyTarget()
    target.doSomething()
}
