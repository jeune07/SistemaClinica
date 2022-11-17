package Entidades;

import java.time.LocalDate;

public class Paciente {
    private Long id;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String DNI;
    private LocalDate fechaAllta;

    public Paciente(Long id, String nombre, String apellido, String domicilio, String DNI, LocalDate fechaAllta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.DNI = DNI;
        this.fechaAllta =fechaAllta;
    }

    public Paciente() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public java.sql.Date getFechaAllta() {
        return java.sql.Date.valueOf(fechaAllta);
    }

    public void setFechaAllta(LocalDate fechaAllta) {
        this.fechaAllta = fechaAllta;
    }
}
