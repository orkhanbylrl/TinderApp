package App.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserRegRqDTO {

    @Email
    @NotBlank(message = "Email can not be an empty")
    private String email;
    @NotBlank(message = "Password can not be an empty")
    private String password;
    @NotBlank(message = "Name can not be an empty")
    private String name;
    @NotBlank(message = "Surname can not be an empty")
    private String surname;
    private String imgUrl;
    @NotBlank(message = "Position can not be an empty")
    private String position;
    @NotNull(message = "Gender can not be an empty")
    private Boolean gender;

}
