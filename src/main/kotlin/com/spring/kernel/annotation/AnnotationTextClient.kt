package com.spring.kernel.annotation

import org.springframework.context.annotation.AnnotationConfigApplicationContext



fun main() {
    val context = AnnotationConfigApplicationContext()


    context.register(context.javaClass)
    context.refresh()

    val text: AnnotationText = context.getBean("annotationText") as AnnotationText

    println(text.name)
    println(text.age)
}
