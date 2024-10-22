package clasesDAO;
import java.util.List;

import clasesNormales.Sugerencia;

public interface SugerenciaDAO {
	
	public abstract Sugerencia obtenerSugerenciaPorId(int id) ;
	public abstract boolean actualizarSugerencia(Sugerencia unaSugerencia);
	public abstract boolean agregarSugerencia(Sugerencia unaSugerencia) ;
	public abstract boolean eliminarSugerencia(Sugerencia unaSugerencia) ;
	public abstract List<Sugerencia> listarSugerencias();
}
