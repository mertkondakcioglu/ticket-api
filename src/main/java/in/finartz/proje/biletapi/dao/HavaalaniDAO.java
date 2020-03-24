package in.finartz.proje.biletapi.dao;

import java.util.List;

import in.finartz.proje.biletapi.model.Havaalani;

public interface HavaalaniDAO {

	List<Havaalani> get();
	Havaalani get(int id);
	void save(Havaalani havaalani);
}
