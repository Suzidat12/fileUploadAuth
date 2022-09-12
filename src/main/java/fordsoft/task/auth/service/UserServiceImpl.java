package fordsoft.task.auth.service;

import fordsoft.task.auth.dto.LoginDto;
import fordsoft.task.auth.dto.LoginResponse;
import fordsoft.task.auth.dto.Usersdto;
import fordsoft.task.auth.entity.Roles;
import fordsoft.task.auth.entity.Roleusers;
import fordsoft.task.auth.entity.Users;
import fordsoft.task.auth.repo.RoleusersRepo;
import fordsoft.task.auth.repo.UserRepo;
import fordsoft.task.auth.utils.Utils;
import io.swagger.annotations.ApiResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.aspectj.bridge.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UsersService {
    @Autowired
    UserRepo userRepo;


    public ResponseEntity addUsers(Usersdto payload) {
        List<Users> usersList = userRepo.checkDuplicate(payload.getUsername());
        if (usersList.isEmpty()) {
            Users users = new Users();
            users.setAppid(users.getAppid());
            users.setUsername(payload.getUsername());
            users.setPassword(payload.getPassword());
            users.setFullname(payload.getFirstname() + " " + payload.getLastname());

            users.setDatecreated(new Date());

            Roleusers roleusers = new Roleusers();
            roleusers.setRoleid(new Roles(4));
            roleusers.setUserid(users);
            roleusers.setDatecreated(new Date());
            List<Roleusers> roleusersList = new ArrayList<>();
            roleusersList.add(roleusers);
            users.setRoleusersList(roleusersList);
            userRepo.save(users);

            return ResponseEntity.ok("Username created successfully");
        } else {
            return ResponseEntity.ok("Username already exist");
        }
    }

    public ResponseEntity findUsername(String username) {
        Optional<Users> usename = userRepo.findByUsername(username);
        return ResponseEntity.ok(usename);
    }

    public ResponseEntity login(LoginDto login) {
        List<Users> usersList = userRepo.isRecordExists(login.getUsername());
        List<Usersdto> list = Utils.maptoUsersList(usersList);
        Usersdto acct = null;
        LoginResponse resp = new LoginResponse();
        if (list.isEmpty()) {
            resp.setData(null);
            resp.setResponse("Either username/password not correct...");
            return ResponseEntity.ok(resp);
        } else {
            acct = list.get(0);
            resp.setResponse("Login successfully");
            return ResponseEntity.ok(resp);
        }

    }

    public ResponseEntity getBusinessTypeList() {
        List<String> businessTypeList = new ArrayList<>(5);
        businessTypeList.add("Consultant");
        businessTypeList.add("Fashion designer");
        businessTypeList.add("Baker");
        businessTypeList.add("Typist");
        businessTypeList.add("Others");

        return ResponseEntity.ok(businessTypeList);
    }
}