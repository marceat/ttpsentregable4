package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Factory.FactoryDAO;
import clasesDAO.ComidaDAO;
import clasesNormales.Comida;

class TestComida {
	
	ComidaDAO funcionesComida;
	Comida nuevaComida1;
	Comida nuevaComida2;
	Comida nuevaComida3;
	Comida nuevaComida4;
	
	@BeforeEach
	void setUp() {
		funcionesComida = FactoryDAO.getComidaDAO();
		nuevaComida1 = new Comida("EMPANADA DE CARNE", 1500, 5);
		nuevaComida2 = new Comida("EMPANADA DE POLLO", 1500, 5);
		nuevaComida3 = new Comida("EMPANADA DE ESPINACA", 1500, 5);
		nuevaComida4 = new Comida("EMPANADA DE HUMITA", 1200, 5);
		
		System.out.println(nuevaComida1.getId());
		System.out.println(nuevaComida2.getId());
		System.out.println(nuevaComida3.getId());
		
		//Comida comidaObtenida = funcionesComida.obtenerComidaPorId(1);
		//comidaObtenida.setNombre("TARTA DE ZAPALLO");
				
		//System.out.println(funcionesComida.actualizarComida(comidaObtenida));
		//funcionesComida.eliminarComida(comidaObtenida);
		//List<Comida> comidas = funcionesComida.listarComidas();
		//for (Comida comidaActual: comidas ) {
		//	System.out.println(comidaActual.getId()+", "+comidaActual.getNombre()+", "+comidaActual.getPrecio()+", "+comidaActual.getStock());
		//}
	}

	@Test
	void agregarUnaComida() {
		Assertions.assertEquals(true, funcionesComida.agregarComida(nuevaComida1));
		//System.out.println("Comparando id "+nuevaComida1.getId());
	}
	
	@Test
	void obtenerUnaComida() {
		funcionesComida.agregarComida(nuevaComida2);
		//System.out.println("Comparando id "+nuevaComida2.getId()+" CON "+funcionesComida.obtenerComidaPorId(nuevaComida2.getId()).getId());
		Assertions.assertEquals(nuevaComida2.getId(), funcionesComida.obtenerComidaPorId(nuevaComida2.getId()).getId());
	}
	
	@Test
	void actualizarUnaComida() {
		funcionesComida.agregarComida(nuevaComida3);
		nuevaComida3.setNombre("TARTA DE CALABAZA Y MUZARELLA");
		Assertions.assertEquals(true, funcionesComida.actualizarComida(nuevaComida3));
	}
	
	@Test
	void eliminarUnaComida() {
		funcionesComida.agregarComida(nuevaComida4);
		Assertions.assertEquals(true, funcionesComida.eliminarComida(nuevaComida4));
	}

}
