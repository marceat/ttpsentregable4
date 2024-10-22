package clasesDAOImpJdbc;

import java.util.List;

import clasesDAO.CartaSemanalDAO;
import clasesNormales.CartaSemanal;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class CartaSemanalDAOjdbc implements CartaSemanalDAO {

	@Override
	public CartaSemanal obtenerCartaSemanalPorId(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		
		etx.begin();
		Query query = em.createQuery("SELECT * FROM CARTA_SEMANAL WHERE id='"+id+"' ");
		CartaSemanal cartaObtenida = (CartaSemanal) query.getSingleResult();  //Página 22, del pdf "JPA" !! 
		
		em.close(); 
		
		return cartaObtenida;
	}

	@Override
	public boolean actualizarCartaSemanal(CartaSemanal unaCartaSemanal) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean agregarCartaSemanal(CartaSemanal unaCartaSemanal) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarCartaSemanal(CartaSemanal unaCartaSemanal) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<CartaSemanal> listarCartaSemanales() {
		// TODO Auto-generated method stub
		return null;
	}

}
