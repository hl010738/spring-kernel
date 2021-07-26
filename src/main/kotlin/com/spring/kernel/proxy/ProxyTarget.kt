package com.spring.kernel.proxy

class ProxyTarget: Target {

    val realTarget: RealTarget = RealTarget()

    override fun doSomething() {

        before()
        realTarget.doSomething()
        after()
    }

    fun before() {
        println("before")
    }

    fun after(){
        println("after")
    }
}
