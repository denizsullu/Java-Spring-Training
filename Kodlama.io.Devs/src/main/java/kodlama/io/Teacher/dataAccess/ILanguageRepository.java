package kodlama.io.Teacher.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Teacher.entities.Language;

public interface ILanguageRepository extends JpaRepository<Language, Integer> {

}
