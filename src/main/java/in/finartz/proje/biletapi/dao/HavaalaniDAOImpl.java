package in.finartz.proje.biletapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.finartz.proje.biletapi.model.Havaalani;

@Repository
public class HavaalaniDAOImpl implements HavaalaniDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Havaalani> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Havaalani> query = currentSession.createQuery("from Havaalani", Havaalani.class);
		List<Havaalani> list = query.getResultList();
		return list;
	}

	@Override
	public Havaalani get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Havaalani havaalaniObj = currentSession.get(Havaalani.class, id);
		return havaalaniObj;
	}

	@Override
	public void save(Havaalani havaalani) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(havaalani);
	}

}
