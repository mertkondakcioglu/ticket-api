package in.finartz.proje.biletapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.finartz.proje.biletapi.dao.RotaDAO;
import in.finartz.proje.biletapi.model.Rota;

@Service
public class RotaServiceImpl implements RotaService {

	@Autowired
	private RotaDAO rotaDAO;
	
	@Transactional
	@Override
	public List<Rota> get() {
		return rotaDAO.get();
	}

	@Transactional
	@Override
	public Rota get(int id) {
		return rotaDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Rota rota) {
		rotaDAO.save(rota);	
	}

}
