package kodlama.io.Kodlama.io.DevsNew.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Kodlama.io.DevsNew.entities.concretes.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer>{

}
