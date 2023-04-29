package App.service;

import App.dto.UserLoginRq;
import App.dto.UserRegRq;
import App.dto.UserResp;
import App.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserResp save(UserRegRq userReg);

    UserResp getUser(UserLoginRq rq) throws UserNotFoundException;
    boolean isUserExist(String email);

}
