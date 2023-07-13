package kodlama.io.Teacher.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Teacher.business.abstracts.ILanguageService;
import kodlama.io.Teacher.business.requests.AddLanguage;
import kodlama.io.Teacher.business.requests.RemoveLanguage;
import kodlama.io.Teacher.business.requests.UpdateLanguage;
import kodlama.io.Teacher.business.responses.GetAllLanguage;
import kodlama.io.Teacher.core.utilites.ILanguageControl;
import kodlama.io.Teacher.dataAccess.ILanguageRepository;
import kodlama.io.Teacher.entities.Language;

@Service
public class LanguageManager implements ILanguageService {
	private ILanguageRepository iLanguageRepository;
	private ILanguageControl control;



	public LanguageManager(ILanguageRepository iLanguageRepository, ILanguageControl control) {
		this.iLanguageRepository = iLanguageRepository;
		this.control = control;
	}

	@Override
	public List<GetAllLanguage> getall() {
		List<Language> languages = iLanguageRepository.findAll();
		List<GetAllLanguage> allLanguages = new ArrayList<GetAllLanguage>();
		for (Language q : languages) {
			GetAllLanguage allLanguage = new GetAllLanguage();
			allLanguage.setName(q.getName());
			allLanguages.add(allLanguage);
		}
		return allLanguages;
	}

	@Override
	public void add(AddLanguage addLanguage) throws Exception {
		if (control.validate(addLanguage)) {
			Language language = new Language();
			language.setName(addLanguage.getName());
			iLanguageRepository.save(language);
		}

	}

	@Override
	public void remove(RemoveLanguage language) {
		iLanguageRepository.deleteById(language.getId());

	}

	@Override
	public void update(UpdateLanguage language) throws Exception {
		List<Language> languages = iLanguageRepository.findAll();
		Boolean isUpdated = false;
		for (Language language2 : languages) {
			if (language2.getName().equals(language.getName())) {
				language2.setName(language.getNewName());
				isUpdated = true;
				iLanguageRepository.save(language2);
			}
		}
		if (!isUpdated) {
			throw new Exception("Böyle bir kurs yok");
		}
	}

}
