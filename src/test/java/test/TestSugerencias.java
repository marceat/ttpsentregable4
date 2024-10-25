package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Factory.FactoryDAO;
import clasesDAO.SugerenciaDAO;
import clasesNormales.Sugerencia;
import clasesNormales.UsuarioGeneral;

class TestSugerencias {

	Sugerencia sugerencia1;
	SugerenciaDAO funcionesSugerencia;
	UsuarioGeneral usuario;
	UsuarioGeneral usuario2;
	Sugerencia sugerencia2;
	Sugerencia sugerencia3;
	@BeforeEach
	void setUp() {
		usuario= new UsuarioGeneral(43323456,"Pedro","Rios","Pedro@gmail.com","12345"," "," ");
		sugerencia1= new Sugerencia("mala atención","atención",usuario);
		usuario2= new UsuarioGeneral(35456123,"Juana","Diaz","JuanaD@gmail.com","23234"," "," ");
		funcionesSugerencia=FactoryDAO.getSugerenciaDAO();
		sugerencia2= new Sugerencia("tardan mucho en los pedidos","atencion",usuario);
		sugerencia3= new Sugerencia("podrian agregar mas mesas al buffet","infraestructura",usuario2);
	}

	@Test
	void agregarSugerencia() {
		Assertions.assertEquals(true,funcionesSugerencia.agregarSugerencia(sugerencia1) );
	
	}
	
	@Test
	void actualizarSugerencia() {
		funcionesSugerencia.agregarSugerencia(sugerencia2);
		sugerencia2.setMensaje("podrian organizar mas los pedidos");
		Assertions.assertEquals(true,funcionesSugerencia.actualizarSugerencia(sugerencia2));
	}
	@Test
	void eliminarSugerencia() {
		funcionesSugerencia.agregarSugerencia(sugerencia3);
		Assertions.assertEquals(true, funcionesSugerencia.eliminarSugerencia(sugerencia3));
	}
	
	
	
	
	
}
