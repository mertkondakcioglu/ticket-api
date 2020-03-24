package in.finartz.proje.biletapi.service;

import java.util.List;

import in.finartz.proje.biletapi.model.Havaalani;

public interface HavaalaniService {

	List<Havaalani> get();
	Havaalani get(int id);
	void save(Havaalani havaalani);
}
