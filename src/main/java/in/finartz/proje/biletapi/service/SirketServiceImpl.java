package in.finartz.proje.biletapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.finartz.proje.biletapi.dao.SirketDAO;
import in.finartz.proje.biletapi.model.Sirket;

@Service
public class SirketServiceImpl implements SirketService {

	@Autowired
	private SirketDAO sirketDAO;
	
	@Transactional
	@Override
	public List<Sirket> get() {
		return sirketDAO.get();
	}

	@Transactional
	@Override
	public Sirket get(int id) {
		return sirketDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Sirket sirket) {
		sirketDAO.save(sirket);
	}

}
