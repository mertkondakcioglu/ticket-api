package in.finartz.proje.biletapi.dao;

import java.util.List;

import in.finartz.proje.biletapi.model.Bilet;

public interface BiletDAO {
	
	List<Bilet> get();
	Bilet get(int id);
	void save(Bilet bilet);
	void delete(int id);
	void update(Bilet bilet);
}
