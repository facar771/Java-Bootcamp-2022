package kodlama.io.Kodlama.io.DevsNew.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.DevsNew.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.DevsNew.business.requests.CreateLanguageRequest;
import kodlama.io.Kodlama.io.DevsNew.business.responses.GetAllLanguagesResponse;

@RestController
@RequestMapping("api/languages")
public class LanguageController {
	
    private	LanguageService languageService;
    
	@Autowired
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@PostMapping("/add")
	void add(CreateLanguageRequest createLanguageRequest) {
		languageService.add(createLanguageRequest);
	}
	
	@DeleteMapping("/delete")
	void delete(GetAllLanguagesResponse getAllLanguagesResponse) {
		languageService.delete(getAllLanguagesResponse);
	}
	
	@PutMapping("/update")
	void update(GetAllLanguagesResponse getAllLanguagesResponse, String name) {
		languageService.update(getAllLanguagesResponse, name);
	}
	
	@GetMapping("/getall")
	List<GetAllLanguagesResponse> getAll() {
		return languageService.getAll();
	}
}
