package clasesDAOImpJpa;

import java.util.List;


import clasesDAO.UsuarioGeneralDAO;
import clasesNormales.UsuarioGeneral;

public class UsuarioGeneralDAOjpa implements UsuarioGeneralDAO{

	@Override
	public UsuarioGeneral encontrarPorDni(int dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean actualizarDatos(UsuarioGeneral usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean iniciarSesion(String dni, int contraseña) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cerrarSesion() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean crearUsuario(UsuarioGeneral unUsuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarUsuario(UsuarioGeneral unUsuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UsuarioGeneral> listarUsuariosComunes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioGeneral> listarUsuariosResponsablesDeTurno() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}