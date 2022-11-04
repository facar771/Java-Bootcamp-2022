package kodlama.io.Kodlama.io.DevsNew.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.DevsNew.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.DevsNew.business.requests.CreateLanguageRequest;
import kodlama.io.Kodlama.io.DevsNew.business.responses.GetAllLanguagesResponse;
import kodlama.io.Kodlama.io.DevsNew.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.DevsNew.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllLanguagesResponse> getAll() {
		
		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguagesResponse> allLanguagesResponses = new ArrayList<>();
		
		for (Language language : languages) {
			GetAllLanguagesResponse responseResponse = new GetAllLanguagesResponse();
			responseResponse.setId(language.getId());
			responseResponse.setName(language.getName());
			
			allLanguagesResponses.add(responseResponse);
		}
		
		return allLanguagesResponses;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		Language language = new Language();
		language.setName(createLanguageRequest.getName());
		languageRepository.save(language);
	}

	@Override
	public void delete(GetAllLanguagesResponse getAllLanguagesResponse) {
		Language language = new Language();
		language.setId(getAllLanguagesResponse.getId());
		languageRepository.delete(language);
	}

	@Override
	public void update(GetAllLanguagesResponse getAllLanguagesResponse, String name) {
		Language language = new Language();
		language.setId(getAllLanguagesResponse.getId());
		language.setName(name);
		languageRepository.save(language);
	}
}
