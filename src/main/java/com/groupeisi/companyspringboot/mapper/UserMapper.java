package com.groupeisi.companyspringboot.mapper;

import com.groupeisi.companyspringboot.dto.UserDto;
import com.groupeisi.companyspringboot.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(UserEntity userEntity);
    UserEntity toUserEntity(UserDto userDto);
    List<UserDto> listUserEntityToListUserDto(List<UserEntity> userEntities);
}
