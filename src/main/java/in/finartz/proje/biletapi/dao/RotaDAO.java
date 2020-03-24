package in.finartz.proje.biletapi.dao;

import java.util.List;

import in.finartz.proje.biletapi.model.Rota;

public interface RotaDAO {
	
	List<Rota> get();
	Rota get(int id);
	void save(Rota rota);
}
