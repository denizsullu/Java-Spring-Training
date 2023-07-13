package kodlama.io.Teacher.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Teacher.entities.Technology;

public interface ITechnologyRepository extends JpaRepository<Technology, Integer> {

}
