package in.finartz.proje.biletapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.finartz.proje.biletapi.model.Havaalani;
import in.finartz.proje.biletapi.service.HavaalaniService;

@RestController
@RequestMapping("/api")
public class HavaalaniController {
	
	@Autowired
	private HavaalaniService havaalaniService;
	
	@GetMapping("/havaalani")
	public List<Havaalani> get(){
		return havaalaniService.get();
	}

	@PostMapping("/havaalani")
	public Havaalani save(@RequestBody Havaalani havaalaniObj ) {
		havaalaniService.save(havaalaniObj);
		return havaalaniObj;
	}

	@GetMapping("/havaalani/{id}")
	public Havaalani get(@PathVariable int id) {
		Havaalani havaalaniObj = havaalaniService.get(id);
		if(havaalaniObj == null)
			throw new RuntimeException(id + " id'li havaalani bulunamadi.");
		return havaalaniObj;
	}
}
