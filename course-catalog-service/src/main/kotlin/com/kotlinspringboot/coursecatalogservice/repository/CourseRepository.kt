package com.kotlinspringboot.coursecatalogservice.repository

import com.kotlinspringboot.coursecatalogservice.entity.Course
import org.springframework.data.repository.CrudRepository

interface CourseRepository: CrudRepository<Course, Int> {
}