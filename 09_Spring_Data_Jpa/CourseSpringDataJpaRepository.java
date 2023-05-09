package com.in28minutes.springboot.learnjapandhibernate.course.springdatajpa;

import com.in28minutes.springboot.learnjapandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
}
