package kodlama.io.Teacher.wepApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Teacher.business.abstracts.ILanguageService;
import kodlama.io.Teacher.business.requests.AddLanguage;
import kodlama.io.Teacher.business.requests.RemoveLanguage;
import kodlama.io.Teacher.business.requests.UpdateLanguage;
import kodlama.io.Teacher.business.responses.GetAllLanguage;

@RestController
@RequestMapping("/language")
public class LanguageController {
	
	ILanguageService iLanguageService;
	@Autowired
	public LanguageController(ILanguageService iLanguageService) {
		this.iLanguageService = iLanguageService;
	}
	@GetMapping("/getallLanguage")
	public List<GetAllLanguage> getall(){
		return iLanguageService.getall();
	}
	@PostMapping("/addlanguage")
	public void add(AddLanguage addLanguage) throws Exception {
		iLanguageService.add(addLanguage);
	}
	@DeleteMapping("/deletelanguage")
	public void remove(RemoveLanguage language) {
		iLanguageService.remove(language);
	}
	@PutMapping("/updatelanguage")
	public void update(UpdateLanguage language) throws Exception {
		iLanguageService.update(language);
	}
	
}
