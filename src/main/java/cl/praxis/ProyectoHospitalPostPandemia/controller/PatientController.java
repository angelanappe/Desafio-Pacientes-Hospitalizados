package cl.praxis.ProyectoHospitalPostPandemia.controller;

import cl.praxis.ProyectoHospitalPostPandemia.service.PatientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PatientController {

    private static final Logger logger = LoggerFactory.getLogger(PatientController.class);

    @Autowired
    private PatientService patientService;

    @GetMapping()
    public String listPatients(Model model) {
        logger.info("Enlistando pacientes hospitalizados...");
        model.addAttribute("patients", patientService.getPatients());
        return "patients";
    }
}
