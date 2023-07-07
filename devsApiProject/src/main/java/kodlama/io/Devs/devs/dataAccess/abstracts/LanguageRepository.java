package kodlama.io.Devs.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.devs.entities.concretes.ProgLanguage;

public interface LanguageRepository {
	List<ProgLanguage> getAll();
	ProgLanguage getById(int i);
	ProgLanguage delete(int id);
	void addLanguage(ProgLanguage language) throws Exception;
	void update(int i,ProgLanguage language);
	
}
