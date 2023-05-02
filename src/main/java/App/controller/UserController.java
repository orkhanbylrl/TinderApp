package App.controller;

import App.dto.UserLoginRq;
import App.dto.UserRegRq;
import App.dto.UserResp;
import App.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/user_prof/{id}")
    public ResponseEntity<UserResp> userProfile(@PathVariable Integer id){
        return null;
    }


}
