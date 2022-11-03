package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{

	List<Language> languages;
	public InMemoryLanguageRepository() {
		languages = new ArrayList<>();
		languages.add(new Language(1,"C#"));
		languages.add(new Language(2,"Java"));
		languages.add(new Language(3,"Python"));
	}

	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public void add(Language Language) {
		languages.add(Language);
	}

	@Override
	public void delete(int id) {
		Language deletedLanguage=getById(id);
		languages.remove(deletedLanguage);
	}

	@Override
	public void update(int id, String updateName) {
		Language updateLanguage = getById(id);
		languages.get(updateLanguage.getId()).setName(updateName);
	}

	@Override
	public Language getById(int id) {
		for(Language language:languages) {
		 	if(language.getId() == id) {
		 		return language;
		 	}
		}
		return null;
	}
}
