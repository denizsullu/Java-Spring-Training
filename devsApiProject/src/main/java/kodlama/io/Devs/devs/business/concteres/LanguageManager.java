package kodlama.io.Devs.devs.business.concteres;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Devs.devs.business.abstracts.LanguageService;
import kodlama.io.Devs.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.devs.entities.concretes.ProgLanguage;

@Service // bu sınıf bir  business nesnesidir
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;
	
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<ProgLanguage> getAll() {
		// iş kuralları
		return languageRepository.getAll();
	}

	@Override
	public void delete(int id) {
		//iş kuralları
		languageRepository.delete(id);
		
	}

	@Override
	public ProgLanguage getById(int i) {
		return languageRepository.getById(i);
	}

	@Override
	public void addLanguage(ProgLanguage language) throws Exception {
		 languageRepository.addLanguage(language);
	}

	@Override
	public void update(int i, ProgLanguage language) {
		 languageRepository.update(i, language);
	}

	
	

	

}
