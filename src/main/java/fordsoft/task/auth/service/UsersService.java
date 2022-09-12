package fordsoft.task.auth.service;

import fordsoft.task.auth.dto.LoginDto;
import fordsoft.task.auth.dto.Usersdto;
import org.springframework.http.ResponseEntity;

public interface UsersService {
    ResponseEntity addUsers(Usersdto payload);
    ResponseEntity findUsername(String username);
    ResponseEntity login(LoginDto login);
    ResponseEntity getBusinessTypeList();

}
