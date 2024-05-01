package com.springassignment.springassignment1.Controller;

import com.springassignment.springassignment1.Exception.ResourceNotFoundException;
import com.springassignment.springassignment1.Model.Courses;
import com.springassignment.springassignment1.Repository.CourseRepository;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/Courses")
@Validated
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    // Endpoint to get all courses
    @GetMapping
    public List<Courses> getAllCourses() {
        return courseRepository.findAll();
    }

    // Build Create Courses
    @PostMapping
    public Courses createCourse(@Valid @RequestBody Courses courses) {
        return courseRepository.save(courses);
    }

    // Build For Retrieve Courses
    @GetMapping("/{id}")
    public ResponseEntity<Courses> getCourseById(@PathVariable long id) {
        Courses courses = courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course Not exist with id:" + id));
        return ResponseEntity.ok(courses);
    }

    // Build For Update Courses
    @PutMapping("/{id}")
    public ResponseEntity<Courses> updateCourses(@PathVariable long id, @RequestBody Courses CourseDetails) {
        Courses updatedCourses = courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not Found with id: " + id));

        updatedCourses.setCourseCode(CourseDetails.getCourseCode());
        updatedCourses.setCourseName(CourseDetails.getCourseName());

        courseRepository.save(updatedCourses);
        return ResponseEntity.ok(updatedCourses);
    }

    // Build Delete Courses
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable long id) {
        Courses courses = courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("course not found with id: " + id));

        courseRepository.delete(courses);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

