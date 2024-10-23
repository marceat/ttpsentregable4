package clasesDAOImpJpa;

import java.util.List;

import clasesDAO.CartaSemanalDAO;
import clasesNormales.CartaSemanal;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class CartaSemanalDAOjpa implements CartaSemanalDAO {
	

	@Override
	public CartaSemanal obtenerCartaSemanalPorId(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		
		// etx.begin();
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

	public boolean agregarCartaSemanal(CartaSemanal unaCartaSemanal) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		
		try {
			etx.begin();
			em.persist(unaCartaSemanal);
			etx.commit();
			
		} catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
		return false;
		
		//return false;
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
