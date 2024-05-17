package ir.mobin.service;

import ir.mobin.models.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);

    Student findById(int id);

    List<Student> findAll();

    void deleteById(int id);

    Student update(Student student);
}
