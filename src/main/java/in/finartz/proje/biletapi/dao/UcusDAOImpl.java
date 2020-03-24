package in.finartz.proje.biletapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.finartz.proje.biletapi.model.Ucus;

@Repository
public class UcusDAOImpl implements UcusDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Ucus> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Ucus> query = currentSession.createQuery("from Ucus", Ucus.class);
		List<Ucus> list = query.getResultList();
		return list;
	}

	@Override
	public Ucus get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Ucus ucusObj = currentSession.get(Ucus.class, id);
		return ucusObj;
	}

	@Override
	public void save(Ucus ucus) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(ucus);
	}

}
