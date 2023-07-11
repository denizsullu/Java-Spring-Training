package kodlama.io.databaseExample.business.abstracts;

import java.util.List;

import kodlama.io.databaseExample.business.requests.CreateTechnologyRequest;
import kodlama.io.databaseExample.business.responses.GetAllTechnologyResponse;

public interface TechnologyService {
	void add(CreateTechnologyRequest technologyRequest);
	List<GetAllTechnologyResponse> getall();
}
