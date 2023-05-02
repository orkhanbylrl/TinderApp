package App.controller;

import App.dto.UserLoginRq;
import App.dto.UserRegRq;
import App.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/app")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody UserRegRq userReg){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userReg));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody UserLoginRq userLogin){
        return ResponseEntity.status(HttpStatus.FOUND).body(userService.getUser(userLogin));
    }
}
