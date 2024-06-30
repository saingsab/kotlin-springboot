package com.learnspring.samplebank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SamplebankApplication

fun main(args: Array<String>) {
	runApplication<SamplebankApplication>(*args)
}
