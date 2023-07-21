package kodlama.io.databaseExample.business.abstracts;

import java.util.List;

import kodlama.io.databaseExample.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.databaseExample.business.responses.GetAllProgrammingLanguageResponse;

public interface ProgrammingLanguageService {
	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
	List<GetAllProgrammingLanguageResponse> getall();
}
