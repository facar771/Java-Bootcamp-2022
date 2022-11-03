package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	void add(Language Language)throws Exception;
	void delete(int id);
	void update(int id, String updateName);
	List<Language> getAll();
	Language getById(int id);
}
