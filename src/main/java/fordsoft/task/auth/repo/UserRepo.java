package fordsoft.task.auth.repo;

import fordsoft.task.auth.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<Users,Long> {
    @Query("select st from Users st where st.username=?1")
    List<Users> checkDuplicate(String username);

    @Query("select st from Users st where st.username=?1")
    Optional<Users> findByUsername(String username);

    @Query(value = "select * FROM users", nativeQuery = true)
    List<Users> listUsers();

    @Query(value="select * from users  where username=:username "
            ,
            nativeQuery=true)
    List<Users> isRecordExists(@Param("username")String username);



}
