package com.example.Consultorio;

import Dao.PacienteDAOH2;
import Entidades.Paciente;
import Services.PacienteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ConsultorioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsultorioApplication.class, args);
		Paciente paciente=new Paciente();
		paciente.setId(1l);
		paciente.setNombre("jeunee007");
		paciente.setApellido("winsley");
		paciente.setFechaAllta(LocalDate.of(1990,10,10));
		paciente.setDNI("666644");
		paciente.setDomicilio("cc444cddxc");

		PacienteService pacienteService=new PacienteService();
		pacienteService.setPacienteIdao(new PacienteDAOH2());
		pacienteService.guardarPaciente(paciente);
	}

}
