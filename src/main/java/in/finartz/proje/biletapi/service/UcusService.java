package in.finartz.proje.biletapi.service;

import java.util.List;

import in.finartz.proje.biletapi.model.Ucus;

public interface UcusService {
	
	List<Ucus> get();
	Ucus get(int id);
	void save(Ucus ucus);
}
