package com.springassignment.springassignment1.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank(message = "Course code is required")
    @Size(max = 10, message = "Course code must be at most 10 characters")
    @Column(name = "CourseCode")
    private String courseCode;

    @NotNull
    @NotBlank(message = "Course name is required")
    @Size(max = 255, message = "Course name must be at most 255 characters")
    @Column(name = "CourseName")
    private String courseName;
    @NotNull
    @NotBlank(message = "Course Catalogue is required")
    @Size(max = 50, message = "Course Catalogue must be at most 255 characters")
    @Column(name = "CourseCatalogue")
    private String courseCatalogue;
    // Constructors
    public Courses() {
    }

    public Courses(String courseCode, String courseName, String courseCatalogue) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCatalogue = courseCatalogue;
    }

    // Getters and setters for ID.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getters and setters for Course Code.
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    // Getters and setters for CourseName.
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Getters and setters for Course Catalogue.
    public String getCourseCatalogue() {
        return courseCatalogue;
    }

    public void setCourseCatalogue(String courseCatalogue) {
        this.courseCatalogue = courseCatalogue;
    }
}
