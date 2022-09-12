package fordsoft.task.auth.repo;

import fordsoft.task.auth.entity.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileDBRepository extends JpaRepository<FileDB,String> {
}
