package kodlama.io.databaseExample.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.databaseExample.entities.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Integer>{

}
