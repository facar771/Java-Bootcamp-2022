package kodlama.io.Kodlama.io.DevsNew.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.DevsNew.business.requests.CreateLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.DevsNew.business.responses.GetAllLanguageTechnologiesResponse;

public interface LanguageTechnologyService {
	void add(CreateLanguageTechnologyRequest createLanguageTechnologyRequest);
	void delete(GetAllLanguageTechnologiesResponse getAllLanguageTechnologiesResponse);
	void update(GetAllLanguageTechnologiesResponse getAllLanguageTechnologiesResponse, String name);
	List<GetAllLanguageTechnologiesResponse> getAll();
}
