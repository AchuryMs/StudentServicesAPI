package co.edu.unbosque.P2_EstudianteServiceAPI.controller.impl;

import co.edu.unbosque.P2_EstudianteServiceAPI.controller.StudentsAPI;
import co.edu.unbosque.P2_EstudianteServiceAPI.model.dtos.StudentDTO;
import co.edu.unbosque.P2_EstudianteServiceAPI.service.StudentServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class StudentController implements StudentsAPI {

    private final StudentServices studentServices;

    public StudentController(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @Override
    public ResponseEntity<StudentDTO> updateStudent(StudentDTO student) {
        return ResponseEntity.status(HttpStatus.OK.value())
                .body(studentServices.updateStudent(student));
    }

    @Override
    public ResponseEntity<Void> deleteStudentById(Integer cedula) {
        studentServices.deleteStudent(cedula);
        return ResponseEntity.status(HttpStatus.OK.value()).build();
    }

    @Override
    public ResponseEntity<StudentDTO> getStudentById(Integer cedula) {
        return ResponseEntity.status(HttpStatus.OK.value())
                .body(studentServices.getStudentById(cedula));
    }

    @Override
    public ResponseEntity<Set<StudentDTO>> getStudents() {
        return ResponseEntity.status(HttpStatus.OK.value())
                .body(studentServices.getAllStudents());
    }

    @Override
    public ResponseEntity<StudentDTO> createStudent(StudentDTO studentDTO) {
        System.out.println(studentDTO.toString());
        return ResponseEntity.status(HttpStatus.CREATED.value())
                .body(studentServices.addStudent(studentDTO));
    }
}
