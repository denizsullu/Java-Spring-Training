package kodlama.io.Devs.devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.devs.entities.concretes.ProgLanguage;

public interface LanguageService {
	List<ProgLanguage> getAll();
	ProgLanguage getById(int i);
	void delete(int id);
	void addLanguage(ProgLanguage language) throws Exception;
	void update(int i,ProgLanguage language);

	
}
