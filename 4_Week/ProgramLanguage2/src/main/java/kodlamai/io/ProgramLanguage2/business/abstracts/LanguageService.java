package kodlamai.io.ProgramLanguage2.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamai.io.ProgramLanguage2.entities.Language;


public interface LanguageService {
	List<Language>  getall();
	void add(Language language) throws Exception;
	void delete(int index);
	void update(int index,Language language);
	Language getid(int id);
	}
