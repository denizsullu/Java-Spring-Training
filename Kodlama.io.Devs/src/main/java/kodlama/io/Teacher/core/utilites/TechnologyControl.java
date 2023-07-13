package kodlama.io.Teacher.core.utilites;

import java.util.List;

import org.springframework.stereotype.Component;

import kodlama.io.Teacher.business.requests.AddTechnology;
import kodlama.io.Teacher.dataAccess.ITechnologyRepository;
import kodlama.io.Teacher.entities.Technology;

@Component
public class TechnologyControl implements ITechnologyControl {
	ITechnologyRepository iTechnologyRepository;

	public TechnologyControl(ITechnologyRepository iTechnologyRepository) {
		this.iTechnologyRepository = iTechnologyRepository;
	}
	
	public boolean isValid(AddTechnology addTechnology) throws Exception {
		List<Technology> technologies = iTechnologyRepository.findAll();
		for (Technology technology : technologies) {
			if(technology.getName().equals(addTechnology.getName())) {
				throw new Exception("Böyle bir teknoloji var");
			}
		}
		return true;
		
	}
}
