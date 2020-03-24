package in.finartz.proje.biletapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.finartz.proje.biletapi.dao.HavaalaniDAO;
import in.finartz.proje.biletapi.model.Havaalani;

@Service
public class HavaalaniServiceImpl implements HavaalaniService {

	@Autowired
	private HavaalaniDAO havaalaniDAO;
	
	@Transactional
	@Override
	public List<Havaalani> get() {
		return havaalaniDAO.get();
	}

	@Transactional
	@Override
	public Havaalani get(int id) {
		return havaalaniDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Havaalani havaalani) {
		havaalaniDAO.save(havaalani);
	}

}
