package Controler;

import Dao.PacienteDAOH2;
import Entidades.Paciente;
import Services.PacienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PacienteController {

    PacienteService pacienteService =new PacienteService(new PacienteDAOH2());
    // hagar tus metodos para interactuar con la base de datos
    @PostMapping("/nuevopaciente")
    public ResponseEntity<String> muevoPaciente(@RequestBody Optional<Paciente> paciente ){
        pacienteService.guardarPaciente(paciente.get());
        return new ResponseEntity<String>("El paciente se ha guardado con exito", HttpStatus.CREATED);
    }




}
