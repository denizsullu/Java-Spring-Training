package kodlamai.io.ProgramLanguage2.business.concretes;

import java.util.List;
import java.util.ResourceBundle.Control;

import org.springframework.stereotype.Service;

import kodlamai.io.ProgramLanguage2.business.abstracts.LanguageService;
import kodlamai.io.ProgramLanguage2.dataAccess.abstracts.ILanguageRepository;
import kodlamai.io.ProgramLanguage2.entities.Language;
import kodlamai.io.ProgramLanguage2.util.IControl;

@Service
public class LanguageManager implements LanguageService {
	private ILanguageRepository iLanguageRepository;
	private IControl control;

	public LanguageManager(ILanguageRepository iLanguageRepository, IControl control) {
		this.iLanguageRepository = iLanguageRepository;
		this.control = control;
	}

	@Override
	public List<Language> getall() {
		return iLanguageRepository.getall();
	}

	@Override
	public void add(Language language) throws Exception {
		if(control.validate(language)) {
			iLanguageRepository.add(language);
		}
		else {
			throw new Exception("Kurs Adı Tekrar Edemez.");
		}

	}

	@Override
	public void delete(int index) {
		iLanguageRepository.delete(index);

	}

	@Override
	public void update(int index, Language language) {
		iLanguageRepository.update(index, language);

	}

	@Override
	public Language getid(int id) {
		return iLanguageRepository.getid(id);
	}

}
