package App.service;

import App.dto.UserRq;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    void save(UserRq userRq);




}
