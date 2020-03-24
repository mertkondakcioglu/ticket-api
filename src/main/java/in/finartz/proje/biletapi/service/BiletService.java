package in.finartz.proje.biletapi.service;

import java.util.List;

import in.finartz.proje.biletapi.model.Bilet;

public interface BiletService {
	
	List<Bilet> get();
	Bilet get(int id);
	void save(Bilet bilet);
	void delete(int id);
	void update(Bilet bilet);
}
