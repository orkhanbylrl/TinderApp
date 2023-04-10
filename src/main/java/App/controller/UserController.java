package App.controller;

import App.dto.UserRegDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/user")
public class UserController {

    @PostMapping
    public ResponseEntity<?> register(@RequestBody UserRegDTO uerReg){


        return null;
    }


}
