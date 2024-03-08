package com.kotlinspringboot.coursecatalogservice

//import com.ig.core_backend.AutoConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
//@Import(AutoConfig::class)
class CourseCatalogServiceApplication

fun main(args: Array<String>) {
	runApplication<CourseCatalogServiceApplication>(*args)
}
