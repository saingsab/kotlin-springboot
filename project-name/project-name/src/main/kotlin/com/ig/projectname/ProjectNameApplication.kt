package com.ig.projectname

import com.ig.core_backend.AutoConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
@Import(AutoConfig::class)
class ProjectNameApplication

fun main(args: Array<String>) {

	runApplication<ProjectNameApplication>(*args)
}
