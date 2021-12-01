package com.example.test1.dto;

import com.example.test1.domain.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class StudentResponse {
    private Long id;
    private String name;

    private String firstName;

    private String lastName;

    public StudentResponse(Student student) {
        this.id = student.getId();
        this.name = student.getName();
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
    }
}
