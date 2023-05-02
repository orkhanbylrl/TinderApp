package App.controller;

import App.dto.UserResp;
import App.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/app/user/{id}")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @GetMapping("/main")
    public ResponseEntity<List<UserResp>> mainPage(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllExcept(id));
    }

    @GetMapping("/user_prof/{user_id}")
    public ResponseEntity<UserResp> userProfile(@PathVariable Integer user_id){
        return null;
    }


}
