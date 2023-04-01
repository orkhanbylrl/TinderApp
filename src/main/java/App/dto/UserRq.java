package App.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserRq {
    @Email
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @NotBlank
    private String imgUrl;
    @NotBlank
    private String position;
    @NotBlank
    private Boolean gender;

}
