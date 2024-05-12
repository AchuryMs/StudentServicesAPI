package co.edu.unbosque.P2_EstudianteServiceAPI.service;

import co.edu.unbosque.P2_EstudianteServiceAPI.model.dtos.StudentDTO;
import co.edu.unbosque.P2_EstudianteServiceAPI.model.entities.Student;
import co.edu.unbosque.P2_EstudianteServiceAPI.repository.StudentsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StudentServices {

    private final StudentsRepository studentsRepository;
    public ModelMapper modelMapper;

    public StudentServices(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
        this.modelMapper = new ModelMapper();
    }

    public StudentDTO updateStudent(StudentDTO studentDTO) {
        System.out.println(studentDTO.getIdNumber());
        if (studentsRepository.existsById(Integer.parseInt( studentDTO.getIdNumber()))){
    return modelMapper.map(studentsRepository.save(modelMapper.map(studentDTO, Student.class)), StudentDTO.class);
    }
    throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public void deleteStudent(Integer studentId) {
    if (studentsRepository.existsById(studentId)){
        studentsRepository.deleteById(studentId);
    }
    throw new ResponseStatusException(HttpStatus.OK);
    }
    public StudentDTO getStudentById(Integer studentId) {
        if (studentsRepository.existsById(studentId)){
            return modelMapper.map(studentsRepository.getById(studentId), StudentDTO.class);
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public StudentDTO addStudent(StudentDTO studentDTO) {
        return modelMapper.map(studentsRepository.save(modelMapper.map(studentDTO, Student.class)),
                StudentDTO.class);
    }

    public Set<StudentDTO> getAllStudents() {
        return studentsRepository
                .findAll()
                .stream()
                .map(entity-> modelMapper.map(entity, StudentDTO.class))
                .collect(Collectors.toSet());
    }
    public StudentDTO getStudent(Integer studentId) {
    return studentsRepository
            .findById(studentId)
            .map(entity-> modelMapper
                    .map(entity, StudentDTO.class))
            .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }



}
