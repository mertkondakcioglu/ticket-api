package in.finartz.proje.biletapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.finartz.proje.biletapi.model.Bilet;
import in.finartz.proje.biletapi.service.BiletService;

@RestController
@RequestMapping("/api")
public class BiletController {
	
	@Autowired
	private BiletService biletService;

	@GetMapping("/bilet")
	public List<Bilet> get(){ return biletService.get(); }

	@PostMapping("/bilet")
	public Bilet save(@RequestBody Bilet biletObj) {
		biletService.save(biletObj);
		return biletObj;
	}
	
	@GetMapping("/bilet/{id}")
	public Bilet get(@PathVariable int id) {
		Bilet biletObj = biletService.get(id);
		if(biletObj == null)
			throw new RuntimeException(id + " id'li bilet bulunamadi.");
		return biletObj;
	}
	
	@DeleteMapping("/bilet/{id}")
	public String delete(@PathVariable int id) {
		biletService.delete(id);
		return id + " id'li bilet silinmiştir.";
	}
	
	@PutMapping("/bilet")
	public Bilet update(@RequestBody Bilet biletObj) {
		biletService.update(biletObj);
		return biletObj;
	}
}
