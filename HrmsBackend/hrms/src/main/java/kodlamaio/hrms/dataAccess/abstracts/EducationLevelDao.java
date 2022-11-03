package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.EducationLevel;

public interface EducationLevelDao extends JpaRepository<EducationLevel, Integer> {

}
