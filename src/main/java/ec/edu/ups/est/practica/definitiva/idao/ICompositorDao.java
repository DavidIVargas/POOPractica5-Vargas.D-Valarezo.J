package ec.edu.ups.est.practica.definitiva.idao;

import ec.edu.ups.est.practica.definitiva.modelo.Compositor;
import java.util.List;

public interface ICompositorDao {
    
    public void create(Compositor compositor);
    public Compositor read(int codigo);
    public void update(Compositor compositor);
    public void delete(Compositor compostior);   
    public Compositor buscarPorTituloDeCancion(String valor);
    public List<Compositor> findAll();
    
}
