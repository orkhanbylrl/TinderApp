package App.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserLoginDTO {

    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
