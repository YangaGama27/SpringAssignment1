package com.springassignment.springassignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringAssignment1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringAssignment1Application.class, args);
    }
    @GetMapping("/All Courses")
    public String getAllCourses() {
        return "<html><body>" +
                "<h1>Available courses for Foundation Courses</h1>" +
                "<p>(1) CSC111F: Computer Literacy for Science</p>" +
                "<p>(2) CSC121F: Introduction to Programming Concepts</p>" +

                "<h1>Available courses for Undergraduate Courses</h1>" +
                "<p>(1) CSC113: Introduction to Computing and Programming Concepts</p>" +
                "<p>(2) CSC121: Elementary Computer Programming\n</p>" +
                "<p>(3) CSC211: Advanced Programming\n</p>" +
                "<p>(4) CSC312: Operating Systems</p>" +
                "<p>(5) CSC313: Object Oriented Programming\n</p>" +

                "<h1>Available courses for Honours Courses</h1>" +
                "<p>(1) CSC501: Mini Project</p>" +
                "<p>(2) CSC512: Computer Networks</p>" +
                "<p>(3) CSC513: Distributed and Parallel Computing</p>" +
                "<p>(4) CSC515: Advanced Java</p>" +

        "<button onclick=\"goBack()\">Back</button>" +
                "<script>function goBack() {window.location.href = " +
                "\"http://localhost:63342/SpringAssignment1/static/Index.html?_ijt=nc0cn3q7bb6uli1l1egj006442&_ij_reload=RELOAD_ON_SAVE\";;}</script>" +
                "</body></html>";
    }
    @GetMapping("/Foundation")
    public String getFoundationCourses() {
        return "<html><body>" +
                "<h1>Available courses for Foundation Courses</h1>" +
                "<p>(1) CSC111F: Computer Literacy for Science</p>" +
                "<p>(2) CSC121F: Introduction to Programming Concepts</p>" +

                "<button onclick=\"goBack()\">Back</button>" +
                "<script>function goBack() {window.location.href = " +
                "\"http://localhost:63342/SpringAssignment1/static/Index.html?_ijt=nc0cn3q7bb6uli1l1egj006442&_ij_reload=RELOAD_ON_SAVE\";;}</script>" +
                "</body></html>";
    }

    @GetMapping("/Undergraduate")
    public String getUndergraduateCourses() {
        return "<html><body>" +
                "<h1>Available courses for Undergraduate Courses</h1>" +
                "<p>(1) CSC113: Introduction to Computing and Programming Concepts</p>" +
                "<p>(2) CSC121: Elementary Computer Programming\n</p>" +
                "<p>(3) CSC211: Advanced Programming\n</p>" +
                "<p>(4) CSC312: Operating Systems</p>" +
                "<p>(5) CSC313: Object Oriented Programming\n</p>" +

                "<button onclick=\"goBack()\">Back</button>" +
                "<script>function goBack() {window.location.href = " +
                "\"http://localhost:63342/SpringAssignment1/static/Index.html?_ijt=nc0cn3q7bb6uli1l1egj006442&_ij_reload=RELOAD_ON_SAVE\";;}</script>" +
                "</body></html>";
    }

    @GetMapping("/Honours")
    public String getHonoursCourses() {
        return "<html><body>" +
                "<h1>Available courses for Honours Courses</h1>" +
                "<p>(1) CSC501: Mini Project</p>" +
                "<p>(2) CSC512: Computer Networks</p>" +
                "<p>(3) CSC513: Distributed and Parallel Computing</p>" +
                "<p>(4) CSC515: Advanced Java</p>" +
                "<button onclick=\"goBack()\">Back</button>" +
                "<script>function goBack() {window.location.href = " +
                "\"http://localhost:63342/SpringAssignment1/static/Index.html?_ijt=nc0cn3q7bb6uli1l1egj006442&_ij_reload=RELOAD_ON_SAVE\";;}</script>" +
                "</body></html>";
    }

}
