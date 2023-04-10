package App.mapper;

import App.dto.UserLoginDTO;
import App.dto.UserRegDTO;
import App.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    User mapToUser(UserLoginDTO loginDTO);
    User mapToUser(UserRegDTO regDTO);
    UserLoginDTO mapToLoginDto(User user);
    UserRegDTO mapToRegDto(User user);
}
