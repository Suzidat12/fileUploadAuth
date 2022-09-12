package fordsoft.task.auth.repo;

import fordsoft.task.auth.entity.Roleusers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleusersRepo extends JpaRepository<Roleusers,Long> {
    @Query("select st from Roleusers st where st.userid.id=?1")
    List<Roleusers> findByAccount(Long id);
}
