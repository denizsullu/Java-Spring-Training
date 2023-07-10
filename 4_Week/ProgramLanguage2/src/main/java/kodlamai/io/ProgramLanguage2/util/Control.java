package kodlamai.io.ProgramLanguage2.util;

import java.util.List;

import org.springframework.stereotype.Component;

import kodlamai.io.ProgramLanguage2.business.concretes.LanguageManager;
import kodlamai.io.ProgramLanguage2.dataAccess.abstracts.ILanguageRepository;
import kodlamai.io.ProgramLanguage2.entities.Language;

@Component
public class Control implements IControl {
	List<Language> languages;
	ILanguageRepository iLanguageRepository;

	
	public Control(ILanguageRepository iLanguageRepository) {
		this.iLanguageRepository = iLanguageRepository;
		languages = iLanguageRepository.getall();
	}

	@Override
	public boolean validate(Language language) {
		for (Language q : languages) {
			if(q.getLanguageName().equals(language.getLanguageName())) {
				return false;
				
			}
		}
		return true;
	}

}
