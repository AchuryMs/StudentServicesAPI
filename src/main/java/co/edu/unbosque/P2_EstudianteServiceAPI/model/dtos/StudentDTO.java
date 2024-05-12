package co.edu.unbosque.P2_EstudianteServiceAPI.model.dtos;
import co.edu.unbosque.P2_EstudianteServiceAPI.model.Status;

public class StudentDTO {

    private String idNumber;
    private String name;
    private String program;
    private Status status;

    public StudentDTO() {}

    public StudentDTO(String idNumber, String name, String program, Status status) {
        this.idNumber = idNumber;
        this.name = name;
        this.program = program;
        this.status = status;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
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
        return "StudentDTO{" +
                "idNumber='" + idNumber + '\'' +
                ", name='" + name + '\'' +
                ", program='" + program + '\'' +
                ", status=" + status +
                '}';
    }
}
