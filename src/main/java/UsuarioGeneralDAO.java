import java.util.List;

public class UsuarioGeneralDAO {
	
	public static UsuarioGeneral encontrarPorDni(int dni) {
		return null;
	}
	
	public static boolean actualizarDatos(UsuarioGeneral usuario) {
		return true;
	}
	
	public static boolean iniciarSesion(String dni, int contraseña) {
		return true;
	}
	
	public static boolean cerrarSesion() {
		return true;
	}
	
	public static boolean crearUsuario(UsuarioGeneral unUsuario) {
		return true;
	}
	
	public static boolean eliminarUsuario(UsuarioGeneral unUsuario) {
		return true;
	}
	
	public static List<UsuarioGeneral> listarUsuariosComunes() {
		return null;
	}
	
	public static List<UsuarioGeneral> listarUsuariosResponsablesDeTurno() {
		return null;
	}
	
}
