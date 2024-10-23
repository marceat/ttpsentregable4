package Factory;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import clasesDAO.CartaSemanalDAO;
import clasesNormales.CartaSemanal;

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
		CartaSemanalDAO funcionesCarta = FactoryDAO.getCartaSemanalDAO();
		
		CartaSemanal nuevaCarta = new CartaSemanal(null, null, null, null, null);
		funcionesCarta.agregarCartaSemanal(nuevaCarta);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
