package kodlama.io.databaseExample.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.databaseExample.business.abstracts.TechnologyService;
import kodlama.io.databaseExample.business.requests.CreateTechnologyRequest;
import kodlama.io.databaseExample.business.responses.GetAllTechnologyResponse;

@RequestMapping("/api1")
@RestController
public class TechnologiesController {
	TechnologyService service;
	
	public TechnologiesController(TechnologyService service) {
		this.service = service;
	}
	@GetMapping("/getalldeniz")
	public List<GetAllTechnologyResponse> getall() {
		return service.getall();
	}
	@PostMapping("/addt")
	public void add(CreateTechnologyRequest createTechnologyRequest) {
		service.add(createTechnologyRequest);
	}
	
}
