package App.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/app")
public class AppController {

    @GetMapping("/login")
    public String handleLogin(){
        return "login";
    }

    @GetMapping("/register")
    public String handleRegister(){
        return "register";
    }


}
