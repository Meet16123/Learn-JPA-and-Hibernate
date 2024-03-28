package com.learnjpaandhibernate.learnjpaandhibernate.course;

import com.learnjpaandhibernate.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.learnjpaandhibernate.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.learnjpaandhibernate.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner
{
//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
    repository.save(new Course(1, "Learn AWS", "Ranga"));
    repository.save(new Course(2, "Learn DevOps", "Meet"));
    repository.save(new Course(3  , "Learn DSA", "Striver"));
        System.out.println(repository.findById(3l));
        System.out.println(repository.findById(1l));
//    repository.deleteById(2l);
        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("Meet"));
        System.out.println(repository.findByName("Learn DSA"));

    }
}
