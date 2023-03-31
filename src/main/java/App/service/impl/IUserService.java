package App.service.impl;

import App.dao.UserRepo;
import App.model.User;
import App.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class IUserService implements UserService, UserDetailsService {

    private final UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = repo.findUserByEmail(email);

        return user.map(IUserDetails::new).orElseThrow(
                () -> new UsernameNotFoundException(String.format("User %s is not found", email)));
    }
}
