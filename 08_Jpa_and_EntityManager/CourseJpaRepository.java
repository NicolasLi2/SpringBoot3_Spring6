package com.in28minutes.springboot.learnjapandhibernate.course.jpa;

import com.in28minutes.springboot.learnjapandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext  //@Autowired is ok,but @PersistenceContext is better
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public Course findById(long id) {
       return entityManager.find(Course.class,id);
    }

    public void deleteById(long id) {
        Course course = entityManager.find(Course.class,id);
        entityManager.remove(course);
    }
}
