package in.finartz.proje.biletapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.finartz.proje.biletapi.dao.BiletDAO;
import in.finartz.proje.biletapi.model.Bilet;

@Service
public class BiletServiceImpl implements BiletService {

	@Autowired
	private BiletDAO biletDAO;


	@Transactional
	@Override
	public List<Bilet> get() { return biletDAO.get(); }

	@Transactional
	@Override
	public Bilet get(int id) {
		return biletDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Bilet bilet) {
		biletDAO.save(bilet);
	}

	@Transactional
	@Override
	public void delete(int id) {
		biletDAO.delete(id);
	}

	@Transactional
	@Override
	public void update(Bilet bilet) { biletDAO.update(bilet);}

}
