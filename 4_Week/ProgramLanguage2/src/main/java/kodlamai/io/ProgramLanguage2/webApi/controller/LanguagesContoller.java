package kodlamai.io.ProgramLanguage2.webApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamai.io.ProgramLanguage2.business.abstracts.LanguageService;
import kodlamai.io.ProgramLanguage2.entities.Language;

@RestController
@RequestMapping("/api")
public class LanguagesContoller {
	private LanguageService languageService;

	public LanguagesContoller(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	List<Language> getall(){
		return languageService.getall();
	}
	@PostMapping("/addlanguage")
	void add(Language language) throws Exception {
		languageService.add(language);
	}
	@DeleteMapping("/delete")
	void delete(int index) {
		languageService.delete(index);
	}
	@PutMapping("/update")
	void update(Language language,int index) {
		languageService.update(index, language);
	}
	@GetMapping("/getlanguage/{id}")
	Language getbyid(@PathVariable("id") int id) {
		return languageService.getid(id);
		
		
	}
	
	
}
