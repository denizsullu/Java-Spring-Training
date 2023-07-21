package kodlama.io.databaseExample.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.databaseExample.business.abstracts.ProgrammingLanguageService;
import kodlama.io.databaseExample.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.databaseExample.business.responses.GetAllProgrammingLanguageResponse;
import kodlama.io.databaseExample.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.databaseExample.entities.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	ProgrammingLanguageRepository languageRepository;
	
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest language) {
		ProgrammingLanguage language2 = new ProgrammingLanguage();
		language2.setName(language.getName());
		
		this.languageRepository.save(language2);
	}

	@Override
	public List<GetAllProgrammingLanguageResponse> getall() {
		List<ProgrammingLanguage> languages = languageRepository.findAll();
		List<GetAllProgrammingLanguageResponse> responses = new ArrayList<GetAllProgrammingLanguageResponse>();
		for (ProgrammingLanguage programmingLanguage : languages) {
			GetAllProgrammingLanguageResponse responseItem = new GetAllProgrammingLanguageResponse();
			responseItem.setId(programmingLanguage.getId());
			responseItem.setName(programmingLanguage.getName());
			responses.add(responseItem);
		}
		return responses;
	}

}
