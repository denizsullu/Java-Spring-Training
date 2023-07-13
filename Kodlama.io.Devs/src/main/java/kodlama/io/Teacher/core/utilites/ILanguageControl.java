package kodlama.io.Teacher.core.utilites;

import kodlama.io.Teacher.business.requests.AddLanguage;

public interface ILanguageControl {
	public boolean validate(AddLanguage addLanguage) throws Exception;
}
