package App.service;

import App.dto.UserRegRq;
import App.dto.UserResp;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserResp save(UserRegRq userReg);
    boolean isUserExist(String email);

}
