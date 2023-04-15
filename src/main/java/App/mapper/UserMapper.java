package App.mapper;

import App.dto.UserLoginRqDTO;
import App.dto.UserRegRqDTO;
import App.dto.UserRespDTO;
import App.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    User mapToUser(UserRegRqDTO regDTO);
    UserRespDTO mapToUserResp(User user);

}
