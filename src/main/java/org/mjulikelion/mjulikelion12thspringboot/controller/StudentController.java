package org.mjulikelion.mjulikelion12thspringboot.controller;

import lombok.AllArgsConstructor;
import org.mjulikelion.likelion12thspringboot.Student;
import org.mjulikelion.mjulikelion12thspringboot.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return this.studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    // 이 URI로 요청이 오면 id 문자열이 파라메터로 전달된다.
    public Student getStudentById(@PathVariable String id) {
        return this.studentService.getStudentById(id);
    }

    @PostMapping("/students")
    @ResponseStatus(HttpStatus.CREATED)
    // Request Body에 있는 정보(json)를 Student 클래스로 바꿔준다.
    public void createStudent(@RequestBody Student student){
        this.studentService.createStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudentById(@PathVariable String id){
        this.studentService.deleteStudentById(id);
    }

    @PatchMapping("/students/{id}")
    // 이름만 바꾸면 되므로 name을 String 으로 받는다.
    // @RequestBody Student student 이런식으로 할 필요가 없음
    public void updateStudentById(@PathVariable String id, @RequestBody String name){
        this.studentService.updateStudentById(id, name);
    }


}
