package com.spring.kernel

import com.spring.kernel.bean.Student
import org.springframework.beans.factory.support.BeanDefinitionReader
import org.springframework.beans.factory.support.DefaultListableBeanFactory
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader
import org.springframework.core.io.ClassPathResource

/*
    IOC
    DI

	* 关于Spring容器管理Bean的过程以及加载模式
		* 需要将bean的定义信息在Spring的配置文件当中
		* 需要通过Spring抽象出的各种Resource来指定对应的配置文件
		* 需要显式声明一个Spring工厂，该工厂用来掌控在配置文件中所声明的各种bean以及bean之间的依赖关系于注入关系
		* 需要定义一个配置信息读取器，用来读取之前所定义的bean配置文件信息
		* 读取器的作用是读取所声明的配置文件信息，并且将读取后的信息装配到之前所声明的工厂当中
		* 需要将读取器于工厂以及资源对象进行相应的关联处理
		* 工厂所管理的全部对象装配完毕，可以供客户端直接调用，获取客户端想要使用的各种bean对象
	* Spring对于Bean管理的核心组件
		* 资源抽象
		* 工厂
		* 配置信息读取器
	* BeanFatory类是Spring 所有工厂的顶层类


 */

fun main() {

    var resource = ClassPathResource("applicationContext.xml")

    var defaultListableBeanFactory = DefaultListableBeanFactory()

    var beanDefinitionReader = XmlBeanDefinitionReader(defaultListableBeanFactory)

    beanDefinitionReader.loadBeanDefinitions(resource)

    var student = defaultListableBeanFactory.getBean("student", Student::class.java)


    println("name: ${student.name}")
    println("age: ${student.age}")
}
