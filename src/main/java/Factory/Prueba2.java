package Factory;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import clasesDAO.CartaSemanalDAO;
import clasesDAO.SugerenciaDAO;
import clasesNormales.CartaSemanal;
import clasesNormales.Sugerencia;
import clasesNormales.UsuarioGeneral;

/**
 * Servlet implementation class Prueba2
 */
@WebServlet("/Prueba2")
public class Prueba2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Prueba2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				response.getWriter().append("Served at: ").append(request.getContextPath());
				SugerenciaDAO funcionesSugerencia = FactoryDAO.getSugerenciaDAO();
				
				//Sugerencia nuevaSugerencia = new Sugerencia("mala atención","atención",null);
				//funcionesSugerencia.agregarSugerencia(nuevaSugerencia);
				Sugerencia sugerenciaObtenida = funcionesSugerencia.obtenerSugerenciaPorId(1);
				//sugerenciaObtenida.setMensaje("atienden como el culo" );
				//funcionesSugerencia.actualizarSugerencia(sugerenciaObtenida);
				funcionesSugerencia.eliminarSugerencia(sugerenciaObtenida);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
