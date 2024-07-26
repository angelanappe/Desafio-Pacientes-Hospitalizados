package cl.praxis.ProyectoHospitalPostPandemia.service;

import cl.praxis.ProyectoHospitalPostPandemia.model.Patient;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

    private List<Patient> patients = new ArrayList<>();
    private Long nextId = 1L;

    public PatientService() {

        patients.add(new Patient(nextId++, "Juan", "Pérez", "12.345.678-9", LocalDate.of(1980, 1, 15)));
        patients.add(new Patient(nextId++, "Pedro", "González", "12.765.432-1", LocalDate.of(1975, 6, 13)));
        patients.add(new Patient(nextId++, "Catalina", "Correa", "18.223.344-5", LocalDate.of(1992, 5, 5)));
        patients.add(new Patient(nextId++, "Laura", "López", "12.712.634-9", LocalDate.of(1975, 8, 22)));
        patients.add(new Patient(nextId++, "Alvaro", "Galindo", "18.765.432-6", LocalDate.of(1992, 10, 5)));
    }

    public List<Patient> getPatients() {
        return patients;
    }
}
