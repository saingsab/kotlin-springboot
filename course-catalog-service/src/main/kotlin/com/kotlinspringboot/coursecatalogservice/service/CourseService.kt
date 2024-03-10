package com.kotlinspringboot.coursecatalogservice.service

import com.kotlinspringboot.coursecatalogservice.dto.CourseDTO
import com.kotlinspringboot.coursecatalogservice.repository.CourseRepository
import io.klogging.logger
import org.springframework.stereotype.Service
import com.kotlinspringboot.coursecatalogservice.entity.Course as Course

@Service
class CourseService(val courseRepository: CourseRepository) {
    fun addCourse(courseDTO: CourseDTO): CourseDTO {
        val courseEntity = courseDTO.let {
            Course(null, it.name, it.category)
        }

        courseRepository.save(courseEntity)

        return courseEntity.let {
            CourseDTO(it.id, it.name, it.category)
        }
    }
}
