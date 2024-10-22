package clasesDAO;
import java.util.List;

import clasesNormales.UsuarioGeneral;

public interface UsuarioGeneralDAO {
	
	public abstract UsuarioGeneral encontrarPorDni(int dni) ;
	public abstract boolean actualizarDatos(UsuarioGeneral usuario) ;
	public abstract boolean iniciarSesion(String dni, int contraseña) ;
	public abstract boolean cerrarSesion() ;
	public abstract boolean crearUsuario(UsuarioGeneral unUsuario) ;
	public abstract boolean eliminarUsuario(UsuarioGeneral unUsuario) ;
	public abstract  List<UsuarioGeneral> listarUsuariosComunes() ;
	public abstract List<UsuarioGeneral> listarUsuariosResponsablesDeTurno();
	
}
