package kodlama.io.databaseExample.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.databaseExample.business.abstracts.TechnologyService;
import kodlama.io.databaseExample.business.requests.CreateTechnologyRequest;
import kodlama.io.databaseExample.business.responses.GetAllTechnologyResponse;
import kodlama.io.databaseExample.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.databaseExample.entities.Technology;

@Service
public class TechnologyManager implements TechnologyService {
	@Autowired
	TechnologyRepository techRepository;
	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) {
		Technology technology = new Technology();
		technology.setName(createTechnologyRequest.getName());
		this.techRepository.save(technology);
	}
	@Override
	public List<GetAllTechnologyResponse> getall() {
		List<Technology> technologies = techRepository.findAll();
		List<GetAllTechnologyResponse> responses = new ArrayList<GetAllTechnologyResponse>();
		for (Technology q : technologies) {
			GetAllTechnologyResponse response = new GetAllTechnologyResponse();
			response.setId(q.getId());
			response.setName(q.getName());
			responses.add(response);
		}
		return responses;
	}

}
