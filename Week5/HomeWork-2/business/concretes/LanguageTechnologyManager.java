package kodlama.io.Kodlama.io.DevsNew.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.DevsNew.business.abstracts.LanguageTechnologyService;
import kodlama.io.Kodlama.io.DevsNew.business.requests.CreateLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.DevsNew.business.responses.GetAllLanguageTechnologiesResponse;
import kodlama.io.Kodlama.io.DevsNew.dataAccess.abstracts.LanguageTechnologyRepository;
import kodlama.io.Kodlama.io.DevsNew.entities.concretes.LanguageTechnology;

@Service
public class LanguageTechnologyManager implements LanguageTechnologyService{

	private LanguageTechnologyRepository languageTechnologyRepository;
	
	@Autowired
	public LanguageTechnologyManager(LanguageTechnologyRepository languageTechnologyRepository) {
		this.languageTechnologyRepository = languageTechnologyRepository;
	}

	@Override
	public void add(CreateLanguageTechnologyRequest createLanguageTechnologyRequest) {
		LanguageTechnology languageTechnology = new LanguageTechnology();
		languageTechnology.setName(createLanguageTechnologyRequest.getName());
		languageTechnologyRepository.save(languageTechnology);
	}

	@Override
	public void delete(GetAllLanguageTechnologiesResponse getAllLanguageTechnologiesResponse) {
		LanguageTechnology languageTechnology = new LanguageTechnology();
		languageTechnology.setId(getAllLanguageTechnologiesResponse.getId());
		languageTechnologyRepository.delete(languageTechnology);
	}

	@Override
	public void update(GetAllLanguageTechnologiesResponse getAllLanguageTechnologiesResponse, String name) {
		LanguageTechnology languageTechnology = new LanguageTechnology();
		languageTechnology.setId(getAllLanguageTechnologiesResponse.getId());
		languageTechnologyRepository.save(languageTechnology);
	}

	@Override
	public List<GetAllLanguageTechnologiesResponse> getAll() {
		List<LanguageTechnology> languageTechnologies = languageTechnologyRepository.findAll();
		List<GetAllLanguageTechnologiesResponse> getAllLanguageTechnologiesResponses = new ArrayList<>();
		
		for (LanguageTechnology languageTechnology : languageTechnologies) {
			GetAllLanguageTechnologiesResponse responseItem = new GetAllLanguageTechnologiesResponse();
			responseItem.setId(languageTechnology.getId());
			responseItem.setName(languageTechnology.getName());
			responseItem.setLanguage(languageTechnology.getLanguage().getName());
			getAllLanguageTechnologiesResponses.add(responseItem);
		}
		
		return getAllLanguageTechnologiesResponses;
	}
}
