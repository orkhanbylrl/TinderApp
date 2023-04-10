package App.service;

import App.dto.UserRegDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void save(UserRegDTO userReg);
    boolean isUserExist(String email);

}
