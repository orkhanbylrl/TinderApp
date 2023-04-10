package App.dto;

import lombok.Data;

@Data
public class UserRespDTO {

    private Integer id;
    private String email;
    private String name;
    private String surname;
    private String imgUrl;
    private String position;
    private Boolean gender;
}
