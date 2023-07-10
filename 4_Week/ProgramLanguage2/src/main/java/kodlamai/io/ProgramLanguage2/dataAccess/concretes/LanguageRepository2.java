package kodlamai.io.ProgramLanguage2.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlamai.io.ProgramLanguage2.dataAccess.abstracts.ILanguageRepository;
import kodlamai.io.ProgramLanguage2.entities.Language;

@Repository
public class LanguageRepository2 implements ILanguageRepository {

	private List<Language> languages;
	
	public LanguageRepository2() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1,"Java"));
		languages.add(new Language(2,"Python"));
		languages.add(new Language(3,"Perls"));
	
	}
	@Override
	public List<Language> getall() {
		return languages;
	}
	@Override
	public void add(Language language) {
		languages.add(language);
		
	}
	@Override
	public void delete(int index) {
		languages.remove(index);
		
	}
	@Override
	public void update(int index, Language language) {
		languages.set(index, language);
		
	}
	@Override
	public Language getid(int index) {
		return languages.get(index);
	}

}
