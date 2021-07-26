package com.spring.kernel.proxy

class RealTarget: Target {
    override fun doSomething() {
        println("doSomething")
    }
}
