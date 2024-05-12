package co.edu.unbosque.P2_EstudianteServiceAPI.model.entities;

import co.edu.unbosque.P2_EstudianteServiceAPI.model.Status;
import jakarta.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNumber;
    @Column
    private String name;
    @Column
    private String program;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Student() {
    }

    public Student(Long idNumber, String name, String program, Status status) {
        this.idNumber = idNumber;
        this.name = name;
        this.program = program;
        this.status = status;
    }

    public Long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber='" + idNumber + '\'' +
                ", name='" + name + '\'' +
                ", program='" + program + '\'' +
                ", status=" + status +
                '}';
    }
}
