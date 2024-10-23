package clasesDAOImpJdbc;

import java.util.List;

import clasesDAO.ComidaDAO;
import clasesNormales.Comida;

public class ComidaDAOjdbc implements ComidaDAO {
	
	@Override
	public Comida obtenerComidaPorId(int id) {
	      return null;
	}
	@Override
	public boolean actualizarComida(Comida unaComida) {
		return true;
	}
	@Override
	public boolean agregarComida(Comida unaComida) {
        return true;		
	}
	@Override
	public boolean eliminarComida(Comida unaComida){
		 return true;
	}
	@Override
	public List<Comida> listarComidas(){
		return null;
	}

	
}