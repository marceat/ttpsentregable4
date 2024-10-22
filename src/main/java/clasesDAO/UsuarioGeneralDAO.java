package clasesDAO;
import java.util.List;

import clasesNormales.UsuarioGeneral;

public interface UsuarioGeneralDAO {
	
	UsuarioGeneral encontrarPorDni(int dni) ;
	boolean actualizarDatos(UsuarioGeneral usuario) ;
	boolean iniciarSesion(String dni, int contraseña) ;
	boolean cerrarSesion() ;
	boolean crearUsuario(UsuarioGeneral unUsuario) ;
	boolean eliminarUsuario(UsuarioGeneral unUsuario) ;
	List<UsuarioGeneral> listarUsuariosComunes() ;
	List<UsuarioGeneral> listarUsuariosResponsablesDeTurno();
	
}
