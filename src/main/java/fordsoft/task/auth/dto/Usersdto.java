package fordsoft.task.auth.dto;

import fordsoft.task.auth.entity.Roles;
import lombok.Data;

@Data
public class Usersdto {
    private String username;
    private String password;
    private String firstname;
    private String lastname;



}
