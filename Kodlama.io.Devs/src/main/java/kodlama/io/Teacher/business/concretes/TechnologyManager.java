package kodlama.io.Teacher.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Teacher.business.abstracts.ITechnologyService;
import kodlama.io.Teacher.business.requests.AddTechnology;
import kodlama.io.Teacher.business.requests.UpdateTechnology;
import kodlama.io.Teacher.business.responses.GetAllTechnology;
import kodlama.io.Teacher.core.utilites.ITechnologyControl;
import kodlama.io.Teacher.dataAccess.ITechnologyRepository;
import kodlama.io.Teacher.entities.Technology;

@Service
public class TechnologyManager implements ITechnologyService {
	ITechnologyRepository technologyRepository;
	ITechnologyControl control;


	public TechnologyManager(ITechnologyRepository technologyRepository, ITechnologyControl control) {
		this.technologyRepository = technologyRepository;
		this.control = control;
	}

	@Override
	public void add(AddTechnology addTechnology) throws Exception {
		if (control.isValid(addTechnology)) {
			Technology technology = new Technology();
			technology.setName(addTechnology.getName());
			technologyRepository.save(technology);
		}

	}

	@Override
	public void remove(int id) {
		technologyRepository.deleteById(id);

	}

	@Override
	public void update(UpdateTechnology technology) throws Exception {
		List<Technology> technologies = technologyRepository.findAll();
		boolean isUpdated = false;
		for (Technology q : technologies) {
			if (q.getName().equals(technology.getName())) {
				q.setName(technology.getNewName());
				technologyRepository.save(q);
				isUpdated = true;
			}
		}
		if (!isUpdated) {
			throw new Exception("Böyle bir kayıt yok");
		}

	}

	@Override
	public List<GetAllTechnology> getall() {
		List<Technology> listOfTechnology = technologyRepository.findAll();
		List<GetAllTechnology> getAllTechnologies = new ArrayList<GetAllTechnology>();
		for (Technology q : listOfTechnology) {
			GetAllTechnology allTechnology = new GetAllTechnology();
			allTechnology.setName(q.getName());
			getAllTechnologies.add(allTechnology);
		}
		return getAllTechnologies;
	}

}
