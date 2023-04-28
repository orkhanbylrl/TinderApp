package App.service.impl;

import App.dao.UserRepo;
import App.dto.UserRegRq;
import App.dto.UserResp;
import App.mapper.UserMapper;
import App.model.User;
import App.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class IUserService implements UserService {

    private final UserRepo repo;
//    private final PasswordEncoder encoder;
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        Optional<User> user = repo.findUserByEmail(email);
//
//        return user.map(IUserDetails::new).orElseThrow(
//                () -> new UsernameNotFoundException(String.format("User %s is not found", email)));
//    }

    @Override
    public UserResp save(UserRegRq userReg) {
        User user = UserMapper.MAPPER.mapToUser(userReg);
        User saved = repo.save(user);
        return UserMapper.MAPPER.mapToUserResp(saved);
    }

    @Override
    public boolean isUserExist(String email) {
        return false;
    }
}
