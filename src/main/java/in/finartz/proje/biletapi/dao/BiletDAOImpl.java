package in.finartz.proje.biletapi.dao;

import java.util.List;

import javax.faces.context.FacesContext;
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
		FacesContext.getCurrentInstance().addMessage(null, new javax.faces.application.FacesMessage("Ekleme işlemi başarılı!"));
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Bilet biletObj = currentSession.get(Bilet.class, id);
		currentSession.delete(biletObj);
		FacesContext.getCurrentInstance().addMessage(null, new javax.faces.application.FacesMessage("Silme işlemi başarılı!"));
	}

	@Override
	public void update(Bilet bilet) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.update(bilet);
		FacesContext.getCurrentInstance().addMessage(null, new javax.faces.application.FacesMessage("Güncelleme işlemi başarılı!"));
	}

}
