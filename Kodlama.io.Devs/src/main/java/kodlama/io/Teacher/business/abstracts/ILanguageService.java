package kodlama.io.Teacher.business.abstracts;

import java.util.List;

import kodlama.io.Teacher.business.requests.AddLanguage;
import kodlama.io.Teacher.business.requests.RemoveLanguage;
import kodlama.io.Teacher.business.requests.UpdateLanguage;
import kodlama.io.Teacher.business.responses.GetAllLanguage;

public interface ILanguageService {
	List<GetAllLanguage> getall();

	void add(AddLanguage addLanguage) throws Exception;

	void remove(RemoveLanguage language);

	void update(UpdateLanguage language) throws Exception;
}
