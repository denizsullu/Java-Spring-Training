package kodlama.io.databaseExample.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.databaseExample.business.abstracts.ProgrammingLanguageService;
import kodlama.io.databaseExample.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.databaseExample.business.responses.GetAllProgrammingLanguageResponse;


@RestController
@RequestMapping("/api/language")
public class ProgrammingLanguageController {
	ProgrammingLanguageService languageService;
	
	public ProgrammingLanguageController(ProgrammingLanguageService languageService) {
		this.languageService = languageService;
	}
	@PostMapping("/add")
	void add(CreateProgrammingLanguageRequest language) {
		languageService.add(language);
	}
	@GetMapping("/getall")
	List<GetAllProgrammingLanguageResponse> getall(){
		return languageService.getall();
	}
}
