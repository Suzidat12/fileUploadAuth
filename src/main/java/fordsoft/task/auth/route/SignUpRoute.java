package fordsoft.task.auth.route;

import fordsoft.task.auth.dto.LoginDto;
import fordsoft.task.auth.dto.Usersdto;
import fordsoft.task.auth.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")

public class SignUpRoute {
    @Autowired
    UsersService usersService;
    @PostMapping("/signUp")
   public ResponseEntity addUsers(@RequestBody Usersdto payload){
        return usersService.addUsers(payload);
    }

    @GetMapping("/findUsername")
    public ResponseEntity findUsername(String username){
        return usersService.findUsername(username);
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginDto login){
        return usersService.login(login);
    }

    @GetMapping("/engnr/task1")
    public ResponseEntity getTask1(){
        return ResponseEntity.ok("Engineering is a good course");
    }
    @GetMapping("/engnr/task2")
    public ResponseEntity getTask2(){
        return ResponseEntity.ok("Engineering is a good course to know");
    }
    @GetMapping("/engnr/task3")
    public ResponseEntity getTask3(){
        return ResponseEntity.ok("Engineering is a good course to study");
    }

    @GetMapping("/finance/fin1")
    public ResponseEntity getFin1(){
        return ResponseEntity.ok("Finance is all about money");
    }
    @GetMapping("/finance/fin2")
    public ResponseEntity getFin2(){
        return ResponseEntity.ok("Finance is about study the flow of income");
    }
    @GetMapping("/finance/fin3")
    public ResponseEntity getFin3(){
        return ResponseEntity.ok("Finance is the basis");
    }

    @GetMapping("/support/sup1")
    public ResponseEntity getSup1(){
        return ResponseEntity.ok("Support gives aid to people");
    }
    @GetMapping("/support/sup2")
    public ResponseEntity getSup2(){
        return ResponseEntity.ok("Support makes more sense");
    }
    @GetMapping("/support/sup3")
    public ResponseEntity getSup3(){
        return ResponseEntity.ok("Support is cool");
    }

    @GetMapping("/account/acct1")
    public ResponseEntity getAcct1(){
        return ResponseEntity.ok("Account is the best practice");
    }
    @GetMapping("/account/acct2")
    public ResponseEntity getAcct2(){
        return ResponseEntity.ok("Account helps you to budget money");
    }
    @GetMapping("/account/acct3")
    public ResponseEntity getAcct3(){
        return ResponseEntity.ok("Account is key");
    }

    @GetMapping("/list/businesslist")
    public ResponseEntity getBusinessTypeList(){
        return usersService.getBusinessTypeList();
    }


}
