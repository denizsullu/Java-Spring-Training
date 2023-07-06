package kodlama.io.Devs.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.devs.entities.concretes.ProgLanguage;

@Repository //Bu sınıf bir data access nesnesidir.
public class InMemoryLanguageRepository implements LanguageRepository {
	
	List<ProgLanguage> progLanguages;
	
	public InMemoryLanguageRepository() {
		progLanguages = new ArrayList<ProgLanguage>();
		progLanguages.add(new ProgLanguage(0,"Java"));
		progLanguages.add(new ProgLanguage(1,"Python"));
		progLanguages.add(new ProgLanguage(2,"c++"));
		progLanguages.add(new ProgLanguage(3,"Javascript"));
		progLanguages.add(new ProgLanguage(4,"c"));
	}


	@Override
	public List<ProgLanguage> getAll() {
		return progLanguages;
	}


	@Override
	public void add() {
		progLanguages.add(new ProgLanguage(4, "deniz"));
		
	}


	@Override
	public void delete(int index) {
		progLanguages.remove(index);
		
	}


	@Override
	public void update(int index,String string) {
		progLanguages.get(index).setLanguage(string);;
		
	}


	@Override
	public void get(int index) {
		progLanguages.get(index);
		
		
	}

}
