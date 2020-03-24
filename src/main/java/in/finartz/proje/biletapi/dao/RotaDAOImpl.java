package in.finartz.proje.biletapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.finartz.proje.biletapi.model.Rota;

@Repository
public class RotaDAOImpl implements RotaDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Rota> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Rota> query = currentSession.createQuery("from Rota", Rota.class);
		List<Rota> list = query.getResultList();
		return list;
	}

	@Override
	public Rota get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Rota rotaObj = currentSession.get(Rota.class, id);
		return rotaObj;
	}

	@Override
	public void save(Rota rota) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(rota);
	}

}
