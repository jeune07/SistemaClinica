package Dao;

import java.util.List;

public interface Idao <T>{
    public List<T> buscarTodos();
    public T guardar(T t);
    public void eliminar (Long id);

}
