package kodlama.io.Devs.devs.webApi.controllers;

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

import kodlama.io.Devs.devs.business.abstracts.LanguageService;
import kodlama.io.Devs.devs.entities.concretes.ProgLanguage;

@RestController //annotation
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;
	
	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<ProgLanguage> getAll(){
		return languageService.getAll();
		
		}
	@GetMapping("/get/{id}")
	public ProgLanguage getById(@PathVariable int id){
		
		return languageService.getById(id);
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") int id) {
		languageService.delete(id);
	
	}
	@PostMapping("/addLanguage")
	public  void addLanguage(@RequestBody ProgLanguage language) throws Exception {
		 languageService.addLanguage(language);
	}
	@PutMapping("/update/{id}")
	public void update(@PathVariable("id") int id,ProgLanguage language) {
		languageService.update(id, language);
		
	}
	
	
}
