package in.finartz.proje.biletapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.finartz.proje.biletapi.model.Sirket;
import in.finartz.proje.biletapi.service.SirketService;

@RestController
@RequestMapping("/api")
public class SirketController {
	
	@Autowired
	private SirketService sirketService;
	
	@GetMapping("/sirket")
	public List<Sirket> get(){
		return sirketService.get();
	}
	
	@PostMapping("/sirket")
	public Sirket save(@RequestBody Sirket sirketObj)
	{
		sirketService.save(sirketObj);
		return sirketObj;
	}
	
	@GetMapping("/sirket/{id}")
	public Sirket get(@PathVariable int id) {
		Sirket sirketObj = sirketService.get(id);
		if(sirketObj == null)
			throw new RuntimeException(id + " id'li sirket bulunamadi.");
		return sirketObj;
	}

}
