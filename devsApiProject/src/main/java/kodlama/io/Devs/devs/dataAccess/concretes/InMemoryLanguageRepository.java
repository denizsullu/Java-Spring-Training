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
		
	}


	@Override
	public List<ProgLanguage> getAll() {
		return progLanguages;
	}
	
	@Override
	public ProgLanguage getById(int i) {
		return progLanguages.get(i);
	}


	@Override
	public ProgLanguage delete(int id) {
		return progLanguages.remove(id);
		
	}


	@Override
	public void addLanguage(ProgLanguage language) throws Exception {
		for (ProgLanguage q : progLanguages) {
			if(q.getLanguage().equals(language.getLanguage())) {
				throw new Exception("Program ismi tekrar edilemez");
			}
		}
		if(language.getLanguage().isEmpty()) {
			throw new Exception("Program ismi boş geçilemez");
		}
		
	
		progLanguages.add(language);
	}


	@Override
	public void update(int i, ProgLanguage language) {
		 progLanguages.set(i, language);
		
		
	}












	




}
