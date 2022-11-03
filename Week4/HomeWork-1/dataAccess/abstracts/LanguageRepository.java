package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	void add(Language Language);
	void delete(int id);
	void update(int id, String updateName);
	List<Language> getAll();
	Language getById(int id);
}
