package org.mjulikelion.mjulikelion12thspringboot.service;

import lombok.AllArgsConstructor;
import org.mjulikelion.likelion12thspringboot.Student;
import org.mjulikelion.mjulikelion12thspringboot.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@AllArgsConstructor // 자동으로 생성자 주입해준다.
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return this.studentRepository.getAllStudents();
    }

    // 이 URI로 요청이 오면 id 문자열이 파라메터로 전달된다.
    public Student getStudentById( String id) {
        return this.studentRepository.getStudentById(id);
    }

    // Request Body에 있는 정보(json)를 Student 클래스로 바꿔준다.
    public void createStudent(Student student){
        this.studentRepository.createStudent(student);
    }

    public void deleteStudentById(String id){
        this.studentRepository.deleteStudentById(id);
    }

    // 이름만 바꾸면 되므로 name을 String 으로 받는다.
    // @RequestBody Student student 이런식으로 할 필요가 없음
    public void updateStudentById(String id, String name){
        this.studentRepository.updateStudentById(id, name);
    }

}
