package App.controller;

import App.dao.UserRepo;
import App.dto.UserLoginDTO;
import App.dto.UserRegDTO;
import App.mapper.UserMapper;
import App.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/app/user")
@RequiredArgsConstructor
public class UserController {


    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserRegDTO uerReg){


        return ResponseEntity.status(HttpStatus.CREATED).body();
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserLoginDTO userLogin){

    }


}
