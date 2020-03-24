package in.finartz.proje.biletapi.service;

import java.util.List;

import in.finartz.proje.biletapi.model.Sirket;

public interface SirketService {
	
	List<Sirket> get();
	Sirket get(int id);
	void save(Sirket sirket);
}
