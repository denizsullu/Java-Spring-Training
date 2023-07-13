package kodlama.io.Teacher.core.utilites;

import java.util.List;

import org.springframework.stereotype.Component;

import kodlama.io.Teacher.business.requests.AddLanguage;
import kodlama.io.Teacher.dataAccess.ILanguageRepository;
import kodlama.io.Teacher.entities.Language;

@Component
public class LanguageControl implements ILanguageControl {
	ILanguageRepository iLanguageRepository;
	public LanguageControl(ILanguageRepository iLanguageRepository) {
		this.iLanguageRepository = iLanguageRepository;
	
	}
	
	public boolean validate(AddLanguage addLanguage) throws Exception {
		List<Language> languages = iLanguageRepository.findAll();
		for(Language q:languages) {
			if(q.getName().equals(addLanguage.getName())) {
				throw new Exception("Name cannot duplicate");
			}
		}
		return true;
	} 
	


	
}
