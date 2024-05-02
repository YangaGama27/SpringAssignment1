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
        Courses courses = new Courses("CSC111F", "Computer Literacy for Science","Foundation Course");
        courseRepository.save(courses);
        Courses courses1 = new Courses("CSC121F", "Introduction to Programming Concepts","Foundation Course");
        courseRepository.save(courses1);

        Courses courses2 = new Courses("CSC113", "Introduction to Computing and Programming Concepts","Undergraduate Course");
        courseRepository.save(courses2);
        Courses courses3 = new Courses("CSC121", "Elementary Computing Programming","Undergraduate Course");
        courseRepository.save(courses3);
        Courses courses4 = new Courses("CSC211", "Advanced Programming","Undergraduate Course");
        courseRepository.save(courses4);
        Courses courses5 = new Courses("CSC312", "Operating System","Undergraduate Course");
        courseRepository.save(courses5);
        Courses courses6 = new Courses("CSC313", "Object Oriented","Undergraduate Course");
        courseRepository.save(courses6);

        Courses courses7 = new Courses("CSC501", "Mini Project","Honours Course");
        courseRepository.save(courses7);
        Courses courses8 = new Courses("CSC512", "Computer Networks","Honours Course");
        courseRepository.save(courses8);
        Courses courses9 = new Courses("CSC513", "Distributed and Parallel Computing","Honours Course");
        courseRepository.save(courses9);
        Courses courses10 = new Courses("CSC515", "Advanced Java","Honours Course");
        courseRepository.save(courses10);
    }
}
