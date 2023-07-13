package kodlama.io.Teacher.wepApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Teacher.business.abstracts.ITechnologyService;
import kodlama.io.Teacher.business.requests.AddTechnology;
import kodlama.io.Teacher.business.requests.UpdateTechnology;
import kodlama.io.Teacher.business.responses.GetAllTechnology;

@RestController
@RequestMapping("/technology")
public class TechnologyController {
	ITechnologyService iTechnologyService;

	public TechnologyController(ITechnologyService iTechnologyService) {
		this.iTechnologyService = iTechnologyService;
	}

	@PostMapping("/addTechnology")
	public void add(AddTechnology addTechnology) throws Exception {
		iTechnologyService.add(addTechnology);
	}

	@DeleteMapping("/removeTechnology/{id}")
	public void remove(@PathVariable int id) {
		iTechnologyService.remove(id);
	}
	@PutMapping("/updateTechnology")
	public void update(UpdateTechnology technology ) throws Exception {
		iTechnologyService.update(technology);
	}
	@GetMapping("/getall")
	public List<GetAllTechnology> getall(){
		return iTechnologyService.getall();
	}
}
