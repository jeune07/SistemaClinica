package Dao;

import Entidades.Paciente;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAOH2 implements Idao<Paciente> {
    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String BD_URL="jdbc:h2:~/clinica";
    private final static String DB_USER_NAME ="sa";
    private final static String DB_PASSWORD="";


    @Override
    public List<Paciente> buscarTodos() {
        List <Paciente> pacientes =new ArrayList<>();
        //Levantando el driver para connectarnos
        try {
            Class.forName(DB_JDBC_DRIVER);
            Connection connection= DriverManager.getConnection(BD_URL,DB_USER_NAME,DB_PASSWORD);

            // Crear una sentencia

            PreparedStatement preparedStatement= connection.prepareStatement("SELECT * FROM PACIENTE ");
           // preparedStatement.setLong(1,id);

            //Ejecutando la sentencia



           Result result= (Result) preparedStatement.executeQuery();
            preparedStatement.close();

            while(((ResultSet) result).next()){
                Long idPaciente= ((ResultSet) result).getLong("id");
                String nombrePaciente= ((ResultSet) result).getNString("nombre");
                String apelllidoPaciente=((ResultSet) result).getNString("apellido");
                String DOmicilioPaciente=((ResultSet) result).getNString("domicilio");
                Date fechaPaciente=((ResultSet) result).getDate("fecha_alta");
                String dniPaciente=((ResultSet) result).getString("dni");

                Paciente paciente =new Paciente();
                paciente.setId(idPaciente);
                paciente.setNombre(nombrePaciente);
                paciente.setApellido(apelllidoPaciente);
                paciente.setDomicilio(DOmicilioPaciente);
                paciente.setFechaAllta(fechaPaciente.toLocalDate());
                paciente.setDNI(dniPaciente);
                pacientes.add(paciente);
            }
            preparedStatement.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        return pacientes;
    }

    @Override
    public Paciente guardar(Paciente paciente) {
        //Levantando el driver para connectarnos
        try {
            Class.forName(DB_JDBC_DRIVER);
            Connection connection= DriverManager.getConnection(BD_URL,DB_USER_NAME,DB_PASSWORD);

            // Crear una sentencia

            PreparedStatement preparedStatement= connection.prepareStatement("INSERT INTO paciente VALUES(?,?,?,?,?,?)");
            preparedStatement.setLong(1,paciente.getId());
            preparedStatement.setString(2, paciente.getNombre());
            preparedStatement.setString(3, paciente.getApellido());
            preparedStatement.setString(4, paciente.getDomicilio());
            preparedStatement.setDate(5, paciente.getFechaAllta());
            preparedStatement.setString(6, paciente.getDNI());
            //Ejecutando la sentencia
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return paciente;
    }

    @Override
    public void eliminar(Long id) {
        //Levantando el driver para connectarnos
        try {
            Class.forName(DB_JDBC_DRIVER);
            Connection connection= DriverManager.getConnection(BD_URL,DB_USER_NAME,DB_PASSWORD);

            // Crear una sentencia

            PreparedStatement preparedStatement= connection.prepareStatement("DELETE FROM paciente WHERE ID=?");
            preparedStatement.setLong(1,id);

            //Ejecutando la sentencia
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
