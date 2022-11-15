package Services;

import Dao.Idao;
import Entidades.Paciente;

import java.util.List;

public class PacienteService implements Idao{
    private Idao <Paciente> pacienteIdao;

    public PacienteService(Idao<Paciente> pacienteIdao) {
        this.pacienteIdao = pacienteIdao;
    }

    public Idao<Paciente> getPacienteIdao() {
        return pacienteIdao;
    }

    public void setPacienteIdao(Idao<Paciente> pacienteIdao) {
        this.pacienteIdao = pacienteIdao;
    }

    public Paciente guardarPaciente(Paciente p){
        return pacienteIdao.guardar(p);
    }
    public void  eliminarPaciente(Long id){
        pacienteIdao.eliminar(id);

    }
    public List<Paciente> BuscarPaciente(Long id){
        return pacienteIdao.buscarTodos();
    }
    @Override
    public List buscarTodos() {
        return null;
    }

    @Override
    public Object guardar(Object o) {
        return null;
    }

    @Override
    public void eliminar(Long id) {

    }
}
