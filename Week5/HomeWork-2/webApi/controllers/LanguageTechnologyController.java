package kodlama.io.Kodlama.io.DevsNew.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.DevsNew.business.abstracts.LanguageTechnologyService;
import kodlama.io.Kodlama.io.DevsNew.business.requests.CreateLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.DevsNew.business.responses.GetAllLanguageTechnologiesResponse;

@RestController
@RequestMapping("api/languageTechnologies")
public class LanguageTechnologyController {
	
	private LanguageTechnologyService languageTechnologyService;
	
	@Autowired
	public LanguageTechnologyController(LanguageTechnologyService languageTechnologyService) {
		this.languageTechnologyService = languageTechnologyService;
	}
	
	@PostMapping("/add")
	void add(CreateLanguageTechnologyRequest createLanguageTechnologyRequest) {
		languageTechnologyService.add(createLanguageTechnologyRequest);
	}
	
	@DeleteMapping("/delete")
	void delete(GetAllLanguageTechnologiesResponse getAllLanguageTechnologiesResponse) {
		languageTechnologyService.delete(getAllLanguageTechnologiesResponse);
	}
	
	@PutMapping("/update")
	void update(GetAllLanguageTechnologiesResponse getAllLanguageTechnologiesResponse, String name) {
		languageTechnologyService.update(getAllLanguageTechnologiesResponse, name);
	}
	
	@GetMapping("/getall")
	List<GetAllLanguageTechnologiesResponse> getAll() {
		return languageTechnologyService.getAll();
	}
}