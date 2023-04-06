package App.service;

import App.dto.UserRegDTO;

public interface UserService {
    void save(UserRegDTO userReg);
    boolean isUserExist(String email);

}
