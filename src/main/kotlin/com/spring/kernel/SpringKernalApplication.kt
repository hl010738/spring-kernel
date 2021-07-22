package com.spring.kernel

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKernalApplication

fun main(args: Array<String>) {
	runApplication<SpringKernalApplication>(*args)
}
