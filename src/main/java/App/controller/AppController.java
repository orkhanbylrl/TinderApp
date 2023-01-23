package App.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AppController {

    @GetMapping("login")
    public ModelAndView handleLogin(){
        return new ModelAndView("login");
    }

    @GetMapping("logout")
    public ModelAndView handleLogout(){
        return new ModelAndView("");
    }
}
