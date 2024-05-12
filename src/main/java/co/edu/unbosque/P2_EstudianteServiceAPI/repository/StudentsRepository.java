package co.edu.unbosque.P2_EstudianteServiceAPI.repository;

import co.edu.unbosque.P2_EstudianteServiceAPI.model.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Student, Integer> {
    //Uses the Jpa Repository to Manage a student CRUD
}
