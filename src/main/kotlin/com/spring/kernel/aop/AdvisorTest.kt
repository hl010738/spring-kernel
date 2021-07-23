package com.spring.kernel.aop

import org.aopalliance.intercept.MethodInterceptor
import org.aopalliance.intercept.MethodInvocation


class AdvisorTest: MethodInterceptor {
    override fun invoke(p0: MethodInvocation): Any? {
        println("Advisor invoked before")

        var result = p0.proceed()

        println("Advisor invoked after")

        return result
    }
}
