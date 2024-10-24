package Factory;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import clasesDAO.CartaSemanalDAO;
import clasesDAO.ComidaDAO;
import clasesDAO.MenuDAO;
import clasesNormales.CartaSemanal;
import clasesNormales.Comida;
import clasesNormales.Menu;

/**
 * Servlet implementation class prueba
 */
@WebServlet("/prueba")
public class prueba extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prueba() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**s
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// CartaSemanalDAO funcionesCarta = FactoryDAO.getCartaSemanalDAO();	
		// CartaSemanal nuevaCarta = new CartaSemanal(null, null, null, null, null);
		// funcionesCarta.agregarCartaSemanal(nuevaCarta);
		
		
		// ==============================================================
		//ComidaDAO funcionesComida = FactoryDAO.getComidaDAO();
		
		//Comida nuevaComida = new Comida("EMPANADAS", 1500, 5);
		//funcionesComida.agregarComida(nuevaComida);
		//Comida comidaObtenida = funcionesComida.obtenerComidaPorId(1);
		//comidaObtenida.setNombre("TARTA DE ZAPALLO");
		
		//System.out.println(funcionesComida.actualizarComida(comidaObtenida));
		//funcionesComida.eliminarComida(comidaObtenida);
		//List<Comida> comidas = funcionesComida.listarComidas();
		//for (Comida comidaActual: comidas ) {
		//	System.out.println(comidaActual.getId()+", "+comidaActual.getNombre()+", "+comidaActual.getPrecio()+", "+comidaActual.getStock());
		//}
		
		// ==============================================================
		MenuDAO funcionesMenu = FactoryDAO.getMenuDAO();
				
		//Menu nuevoMenu = new Menu("MENÚ VEGANO", "PAPAS","ZANAHORIA","NARANJA","GASEOSA","VEGETARIANO", 4500);
		//funcionesMenu.agregarMenu(nuevoMenu);
		Menu menuObtenido = funcionesMenu.encontrarMenuPorId(102);
		System.out.println(menuObtenido.getNombreMenu()+", "+menuObtenido.getEntrada()+","+menuObtenido.getPlatoPrincipal());
		menuObtenido.setEntrada("TARTA DE BERENJENA");
		
		System.out.println(funcionesMenu.actualizarMenu(menuObtenido));
		funcionesMenu.eliminarMenu(menuObtenido);
		List<Menu> menues = funcionesMenu.listarMenues();
		for (Menu menuActual: menues ) {
			System.out.println(menuActual.getNombreMenu()+", "+menuActual.getEntrada()+","+menuActual.getPlatoPrincipal());
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
