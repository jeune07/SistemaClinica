package Services;

import Dao.Idao;
import Entidades.Odontologo;
import Entidades.Paciente;

import java.util.List;

public class OdontologoService implements Idao {
    private Idao<Odontologo> odontologoIdao;

    public OdontologoService(Idao<Odontologo> odontologoIdao) {
        this.odontologoIdao = odontologoIdao;
    }

    public Idao<Odontologo> getOdontologoIdao() {
        return odontologoIdao;
    }

    public void setOdontologoIdao(Idao<Odontologo> odontologoIdao) {
        this.odontologoIdao = odontologoIdao;
    }

    public Odontologo guardarodontologo(Odontologo o){
        return odontologoIdao.guardar(o);
    }
    public void  eliminarOdontolo(Long id){
        odontologoIdao.eliminar(id);

    }
    public List<Odontologo> buscarOdologo(Long id){
        return odontologoIdao.buscarTodos();
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
