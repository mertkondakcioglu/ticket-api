package in.finartz.proje.biletapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.finartz.proje.biletapi.model.Bilet;

@Repository
public class BiletDAOImpl implements BiletDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Bilet> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Bilet> query = currentSession.createQuery("from Bilet", Bilet.class);
		List<Bilet> list = query.getResultList();
		return list;
	}

	@Override
	public Bilet get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Bilet biletObj = currentSession.get(Bilet.class, id);
		return biletObj;
	}

	@Override
	public void save(Bilet bilet) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(bilet);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Bilet biletObj = currentSession.get(Bilet.class, id);
		currentSession.delete(biletObj);
	}

	@Override
	public void update(Bilet bilet) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.update(bilet);
	}

}
