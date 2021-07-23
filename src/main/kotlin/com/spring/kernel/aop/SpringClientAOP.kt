package com.spring.kernel.aop

import com.spring.kernel.bean.Student
import org.springframework.beans.factory.support.BeanDefinitionReader
import org.springframework.beans.factory.support.DefaultListableBeanFactory
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader
import org.springframework.core.io.ClassPathResource


fun main() {

    var resource = ClassPathResource("applicationContext.xml")

    var defaultListableBeanFactory = DefaultListableBeanFactory()

    var beanDefinitionReader = XmlBeanDefinitionReader(defaultListableBeanFactory)

    beanDefinitionReader.loadBeanDefinitions(resource)

    var serviceInterface = defaultListableBeanFactory.getBean("aopTest", ServiceInterface::class.java)

    serviceInterface.testMethod()
}
