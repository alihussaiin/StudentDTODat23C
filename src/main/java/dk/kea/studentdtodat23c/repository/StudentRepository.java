package dk.kea.studentdtodat23c.repository;

import dk.kea.studentdtodat23c.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
