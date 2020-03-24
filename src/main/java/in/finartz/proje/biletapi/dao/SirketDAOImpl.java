package in.finartz.proje.biletapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.finartz.proje.biletapi.model.Sirket;

@Repository
public class SirketDAOImpl implements SirketDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Sirket> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Sirket> query = currentSession.createQuery("from Sirket", Sirket.class);
		List<Sirket> list = query.getResultList();
		return list;
	}

	@Override
	public Sirket get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Sirket sirketObj = currentSession.get(Sirket.class, id);
		return sirketObj;
	}

	@Override
	public void save(Sirket sirket) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(sirket);
	}

}
