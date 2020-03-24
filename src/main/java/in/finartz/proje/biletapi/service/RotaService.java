package in.finartz.proje.biletapi.service;

import java.util.List;

import in.finartz.proje.biletapi.model.Rota;

public interface RotaService {
	
	List<Rota> get();
	Rota get(int id);
	void save(Rota rota);
}
