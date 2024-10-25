package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Factory.FactoryDAO;
import clasesDAO.UsuarioGeneralDAO;
import clasesNormales.UsuarioGeneral;

class TestUsuarioGeneral {
    UsuarioGeneralDAO funcionesUsuario;
	UsuarioGeneral usuario1;
	UsuarioGeneral usuario2;
	UsuarioGeneral usuario3;
	@BeforeEach
	void setUp() {
		usuario1= new UsuarioGeneral(3122323,"Leonardo","Marin","LeoMar@gmail.com","21234"," "," ");
		usuario2=new UsuarioGeneral(46543123,"Luz","Martinez","Luz123@gmail.com","12345","","");
		usuario3=new UsuarioGeneral(46543123,"Brenda","Poch","brenda123@gmail.com","12345","","");
		funcionesUsuario=FactoryDAO.getUsuarioGeneralDAO();
	}
	
	@Test
	void crearUsuario() {
		Assertions.assertEquals(true, funcionesUsuario.crearUsuario(usuario1));
	}

	@Test
	void actualizarDatos() {
		funcionesUsuario.crearUsuario(usuario2);
		usuario2.setNombre("Lucrecia");
		
		Assertions.assertEquals(true, funcionesUsuario.actualizarDatos(usuario2));
	}
	
	@Test
	void eliminarUsuario() {
		funcionesUsuario.crearUsuario(usuario3);
		Assertions.assertEquals(true, funcionesUsuario.eliminarUsuario(usuario3));
	}
	
}
