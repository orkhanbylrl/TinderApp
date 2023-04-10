package App.mapper;

import App.dto.UserLoginDTO;
import App.dto.UserRegDTO;
import App.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User mapToUser(UserLoginDTO loginDTO);
    User mapToUser(UserRegDTO regDTO);
}
