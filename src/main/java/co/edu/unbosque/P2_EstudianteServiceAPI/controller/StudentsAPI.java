package co.edu.unbosque.P2_EstudianteServiceAPI.controller;

import co.edu.unbosque.P2_EstudianteServiceAPI.model.dtos.StudentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RequestMapping("/estudiantes/api")
public interface StudentsAPI {

    @PutMapping("/estudiante/{cedula}")
    ResponseEntity<StudentDTO> updateStudent(@RequestBody StudentDTO student);

    @DeleteMapping("/estudiante/{cedula}")
    ResponseEntity<Void> deleteStudentById(@PathVariable Integer cedula);

    @GetMapping("/estudiante/{cedula}")
    ResponseEntity<StudentDTO> getStudentById(@PathVariable Integer cedula);

    @GetMapping("/estudiante")
    ResponseEntity<Set<StudentDTO>> getStudents();

    @PostMapping("/estudiante")
    ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO student);

}
