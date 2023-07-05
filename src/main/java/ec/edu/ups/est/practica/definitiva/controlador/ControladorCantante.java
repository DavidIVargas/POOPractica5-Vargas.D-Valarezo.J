
package ec.edu.ups.est.practica.definitiva.controlador;

import ec.edu.ups.est.practica.definitiva.idao.ICantanteDao;
import ec.edu.ups.est.practica.definitiva.modelo.Cantante;
import ec.edu.ups.est.practica.definitiva.modelo.Disco;
import java.util.List;


public class ControladorCantante {
    private Cantante cantante;
    private Disco disco;
    private ICantanteDao cantanteDao;
    

    // constructor

    public ControladorCantante(ICantanteDao cantanteDao) {
        this.cantanteDao = cantanteDao;
        
        
    }
    
    public void registrar(Cantante cantante) {
        cantanteDao.create(cantante);
    }
    
    public boolean actualizar(Cantante cantante) {
    try {
        cantanteDao.update(cantante);
        return true;
    } catch (Exception e) {
        return false;
    }
}

    public void eliminar(Cantante cantante) {
        cantanteDao.delete(cantante);
    }
    
    
    public Cantante buscarCantante(int id) {
        return cantanteDao.read(id);
    }


    
    public List<Cantante> verCantantes() {
        return cantanteDao.findAll();
        
    }
    
    public Disco buscarporDisco(String nombre){
        return cantanteDao.buscarPorNombreDeDisco(nombre);
    }
    
    public void eliminarDisco(Cantante cantante,int codigo){
        List<Disco> listaDiscos=cantante.getDiscos();
        for (Disco listaDisco : listaDiscos) {
            if (listaDisco.getCodigo()==codigo) {
                cantante.eliminarDisco(codigo);
                cantanteDao.update(cantante);
            }
        }
    }
    
    public void actualizarDisco(Cantante cantante,Disco disco){
        cantante.actualizarDisco(disco);
        cantanteDao.update(cantante); 
    }
    
    
    
}
