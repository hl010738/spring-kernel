package com.spring.kernel.dynamicproxy

class RealSubject: Subject {
    override fun doSomething() {
        println("doSomething")
    }
}
