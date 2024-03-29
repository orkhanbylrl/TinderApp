package App.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.HashSet;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @Email
    @NotBlank
    @Column(unique = true)
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String name;
    @NotBlank
    private String surname;

    private String imgUrl;
    @NotBlank
    private String position;
    @NotNull
    private Boolean gender;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",
    joinColumns = {
            @JoinColumn(name = "user_id")
    },
    inverseJoinColumns = {
            @JoinColumn(name = "role_id")
    })
    private Collection<Role> roles = new HashSet<>();


}
