package App.mapper;

import App.dto.UserRegRq;
import App.dto.UserResp;
import App.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    User mapToUser(UserRegRq reg);
    UserResp mapToUserResp(User user);

}
