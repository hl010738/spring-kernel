package com.spring.kernel.annotation

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AnnotationTextConfiguration {

    @Bean("annotationText")
    fun getBean(): AnnotationText{
        val annotationText = AnnotationText()
        annotationText.name = "bbb"
        annotationText.age = 100
        return annotationText
    }
}
