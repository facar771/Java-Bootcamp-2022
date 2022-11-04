package kodlama.io.Kodlama.io.DevsNew.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.DevsNew.business.requests.CreateLanguageRequest;
import kodlama.io.Kodlama.io.DevsNew.business.responses.GetAllLanguagesResponse;

public interface LanguageService {
	void add(CreateLanguageRequest createLanguageRequest);
	void delete(GetAllLanguagesResponse getAllLanguagesResponse);
	void update(GetAllLanguagesResponse getAllLanguagesResponse, String name);
	List<GetAllLanguagesResponse> getAll();
}