package ir.mobin.service;

import ir.mobin.models.Student;
import ir.mobin.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public Student update(Student student) {
        Student updateStudent = studentRepository.findById(student.getId()).orElseThrow(() -> new RuntimeException("Student not found"));
        updateStudent.setName(student.getName());
        return studentRepository.save(updateStudent);
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }


    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }


    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);

    }

}
