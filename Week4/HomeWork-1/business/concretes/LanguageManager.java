package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{

	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}

	@Override
	public void add(Language Language) throws Exception{
		for(Language language:getAll()) {
			if(language.getName().equals(Language.getName())) {
				throw new Exception("This language has been added before");
			}
			else if(Language.getName().isBlank()) {
				throw new Exception("name cannot be blank");
			}
		}
		languageRepository.add(Language);
	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
	}

	@Override
	public void update(int id, String updateName) {
		
		languageRepository.update(id, updateName);
	}

	@Override
	public List<Language> getAll() {

		return languageRepository.getAll();
	}

	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);
	}
	
}
