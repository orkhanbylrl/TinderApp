package App.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
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
