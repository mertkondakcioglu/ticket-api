package in.finartz.proje.biletapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.finartz.proje.biletapi.dao.UcusDAO;
import in.finartz.proje.biletapi.model.Ucus;

@Service
public class UcusServiceImpl implements UcusService {

	@Autowired
	private UcusDAO ucusDAO;
	
	@Transactional
	@Override
	public List<Ucus> get() {
		return ucusDAO.get();
	}

	@Transactional
	@Override
	public Ucus get(int id) {
		return ucusDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Ucus ucus) {
		ucusDAO.save(ucus);
	}

}
