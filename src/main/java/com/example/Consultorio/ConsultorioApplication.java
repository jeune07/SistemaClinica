package com.example.Consultorio;

import Dao.PacienteDAOH2;
import Entidades.Paciente;
import Services.PacienteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsultorioApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConsultorioApplication.class, args);

		Paciente paciente=new Paciente();
		paciente.setId(1l);
		paciente.setNombre("jeune");
		paciente.setApellido("winsley");
		paciente.setFechaAllta(	"Mar 25 2015");
		paciente.setDNI("44444444444444");
		paciente.setDomicilio("cccddxc");

		PacienteService pacienteService=new PacienteService();
		pacienteService.setPacienteIdao(new PacienteDAOH2());
		pacienteService.guardarPaciente(paciente);
	}

}
