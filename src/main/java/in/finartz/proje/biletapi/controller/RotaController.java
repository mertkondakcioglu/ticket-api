package in.finartz.proje.biletapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.finartz.proje.biletapi.model.Rota;
import in.finartz.proje.biletapi.service.RotaService;

@RestController
@RequestMapping("/api")
public class RotaController {
	
	@Autowired
	private RotaService rotaService;
	
	@GetMapping("/rota")
	public List<Rota> get(){
		return rotaService.get();
	}
	
	@PostMapping("/rota")
	public Rota save(@RequestBody Rota rotaObj) {
		rotaService.save(rotaObj);
		return rotaObj;
	}

	@GetMapping("/rota/{id}")
	public Rota get(@PathVariable int id) {
		Rota rotaObj = rotaService.get(id);
		if(rotaObj == null)
			throw new RuntimeException(id + " id'li rota bulunamadi.");
		return rotaObj;
	}

}
