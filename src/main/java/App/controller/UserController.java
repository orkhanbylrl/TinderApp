package App.controller;

import App.dto.UserLoginRqDTO;
import App.dto.UserRegRqDTO;
import App.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserRegRqDTO userReg){

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userReg));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserLoginRqDTO userLogin){

        return null;
    }


}
