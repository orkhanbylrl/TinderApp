package App.service;

import App.dto.UserRegRqDTO;
import App.dto.UserRespDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserRespDTO save(UserRegRqDTO userReg);
    boolean isUserExist(String email);

}
