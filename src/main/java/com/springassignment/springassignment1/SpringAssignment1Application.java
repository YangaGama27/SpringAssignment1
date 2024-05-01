package com.springassignment.springassignment1;


import com.springassignment.springassignment1.Model.Courses;
import com.springassignment.springassignment1.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAssignment1Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringAssignment1Application.class, args);
    }

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public void run(String... args) throws Exception {
        Courses courses = new Courses("CSC111F", "Computer Literacy for Science");
        courseRepository.save(courses);
        Courses courses1 = new Courses("CSC121F", "Introduction to Programming Concepts");
        courseRepository.save(courses1);

        Courses courses2 = new Courses("CSC113", "Introduction to Computing and Programming Concepts");
        courseRepository.save(courses2);
        Courses courses3 = new Courses("CSC121", "Elementary Computing Programming");
        courseRepository.save(courses3);
        Courses courses4 = new Courses("CSC211", "Advanced Programming");
        courseRepository.save(courses4);
        Courses courses5 = new Courses("CSC312", "Operating System");
        courseRepository.save(courses5);
        Courses courses6 = new Courses("CSC313", "Object Oriented");
        courseRepository.save(courses6);

        Courses courses7 = new Courses("CSC501", "Mini Project");
        courseRepository.save(courses7);
        Courses courses8 = new Courses("CSC512", "Computer Networks");
        courseRepository.save(courses8);
        Courses courses9 = new Courses("CSC513", "Distributed and Parallel Computing");
        courseRepository.save(courses9);
        Courses courses10 = new Courses("CSC515", "Advanced Java");
        courseRepository.save(courses10);
    }
}
