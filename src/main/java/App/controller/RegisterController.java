package App.controller;

import App.dto.UserRegDTO;
import App.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/app")
public class RegisterController {

    private final UserService userService;


    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("regUser", new UserRegDTO());
        return "register";
    }

    @PostMapping("/register")
    public String handleRegister(@ModelAttribute @Valid UserRegDTO userRegDTO, BindingResult result, Model model){
        if(result.hasErrors() || userService.isUserExist(userRegDTO.getEmail())){
            model.addAttribute("userReg", new UserRegDTO());
        }

        userService.save(userRegDTO);

        return "";

    }


}
