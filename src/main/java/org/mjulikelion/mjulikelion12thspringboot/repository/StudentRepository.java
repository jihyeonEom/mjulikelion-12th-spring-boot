package org.mjulikelion.mjulikelion12thspringboot.repository;

import org.mjulikelion.likelion12thspringboot.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
// 이 어노테이션도 Component를 포함한다.
public class StudentRepository {
    private  final List<Student> studentList = new ArrayList<>();

    public List<Student> getAllStudents() {
        return this.studentList;
    }

    public Student getStudentById(String id) {
        for(Student student : this.studentList) {
            if(student.getId().equals(id)) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student with id " + id + " not found");
    }

    public void updateStudentById(String id, String name){
        for(Student s: this.studentList) {
            if(s.getId().equals(id)) {
                this.studentList.remove(s);
                this.studentList.add(new Student(id, name));
                return;
            }
        }
        throw new IllegalArgumentException("Student with id " + id + " not found");
    }

    public void createStudent(Student student) {
        for(Student s : this.studentList){
            if(s.getId().equals(student.getId())) {
                throw new IllegalArgumentException("Student with id " + student.getId() + " already exists");
            }
        }
        this.studentList.add(student);
    }

    public void deleteStudentById(String id) {
        for (Student student : this.studentList) {
            if (student.getId().equals(id)) {
                this.studentList.remove(student);
                return;
            }
        }
        throw new IllegalArgumentException("Student not found");
    }
}
