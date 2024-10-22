package clasesDAO;
import java.util.List;

import clasesNormales.Sugerencia;

public interface SugerenciaDAO {
	
	Sugerencia obtenerSugerenciaPorId(int id) ;
	boolean actualizarSugerencia(Sugerencia unaSugerencia);
	boolean agregarSugerencia(Sugerencia unaSugerencia) ;
	boolean eliminarSugerencia(Sugerencia unaSugerencia) ;
	List<Sugerencia> listarSugerencias();
}
