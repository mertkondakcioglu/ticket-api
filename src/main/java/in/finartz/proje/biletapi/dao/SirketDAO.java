package in.finartz.proje.biletapi.dao;

import java.util.List;

import in.finartz.proje.biletapi.model.Sirket;

public interface SirketDAO {
	
	List<Sirket> get();
	Sirket get(int id);
	void save(Sirket sirket);
}
