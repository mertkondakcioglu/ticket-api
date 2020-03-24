package in.finartz.proje.biletapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.finartz.proje.biletapi.model.Ucus;
import in.finartz.proje.biletapi.service.UcusService;

@RestController
@RequestMapping("/api")
public class UcusController {
	
	@Autowired
	public UcusService ucusService;
	
	@GetMapping("/ucus")
	public List<Ucus> get(){
		return ucusService.get();
	}
	
	@PostMapping("/ucus")
	public Ucus save(@RequestBody Ucus ucusObj) {
		ucusService.save(ucusObj);
		return ucusObj;
	}
	
	@GetMapping("/ucus/{id}")
	public Ucus get(@PathVariable int id) {
		Ucus ucusObj = ucusService.get(id);
		if(ucusObj == null)
			throw new RuntimeException(id + " id'li ucus bulunamadi.");
		return ucusObj;
	}

}
