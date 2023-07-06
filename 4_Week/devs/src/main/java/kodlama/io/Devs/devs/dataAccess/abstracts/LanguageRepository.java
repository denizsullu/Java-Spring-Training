package kodlama.io.Devs.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.devs.entities.concretes.ProgLanguage;

public interface LanguageRepository {
	List<ProgLanguage> getAll();
	void add();
	void delete(int index);
	void update(int index,String string);
	void get(int index);
}
