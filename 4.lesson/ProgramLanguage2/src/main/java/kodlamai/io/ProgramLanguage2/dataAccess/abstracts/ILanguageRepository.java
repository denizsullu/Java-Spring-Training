package kodlamai.io.ProgramLanguage2.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlamai.io.ProgramLanguage2.entities.Language;


public interface ILanguageRepository {
	List<Language> getall();
	void add(Language language);
	void delete(int index);
	void update(int index,Language language);
	Language getid(int index);
}
