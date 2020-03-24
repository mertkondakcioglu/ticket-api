package in.finartz.proje.biletapi.dao;

import java.util.List;

import in.finartz.proje.biletapi.model.Ucus;

public interface UcusDAO {
	
	List<Ucus> get();
	Ucus get(int id);
	void save(Ucus ucus);
}
