package com.example.test1.application;

import com.example.test1.domain.Student;
import com.example.test1.dto.StudentCamelRequest;
import com.example.test1.dto.StudentRequest;
import com.example.test1.dto.StudentResponse;
import com.example.test1.infra.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentResponse getStudent(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
        return new StudentResponse(student);
    }

    @Transactional
    public StudentResponse updateStudent(Long id, StudentRequest request) {
        Student student = studentRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);

        student.changeName(request.getName());

        return new StudentResponse(student);
    }

    @Transactional
    public StudentResponse createStudent(StudentRequest request) {
        Student student = new Student(
                request.getName(),
                request.getFirstName(),
                request.getLastName(),
                request.getPhoneNumber()
        );

        Student saved = studentRepository.save(student);
        return new StudentResponse(saved);
    }

    @Transactional
    public StudentResponse createStudent(StudentCamelRequest request) {
        Student student = new Student(
                request.getName(),
                request.getFirstName(),
                request.getLastName(),
                request.getPhoneNumber()
        );

        Student saved = studentRepository.save(student);
        return new StudentResponse(saved);
    }
}
