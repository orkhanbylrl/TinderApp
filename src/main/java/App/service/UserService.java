package App.service;

import App.dao.UserRepo;
import App.model.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class UserService {
    private final UserRepo repo;

    public Optional<User> getUserByEmail(@Email String email, @NotBlank String password){
        return repo.findUserByEmailAndPassword(email, password);
    }





}
