package com.groupeisi.companyspringboot.service.impl;

import com.groupeisi.companyspringboot.dao.IUserDao;
import com.groupeisi.companyspringboot.dto.UserDto;
import com.groupeisi.companyspringboot.entity.UserEntity;
import com.groupeisi.companyspringboot.exception.DuplicateException;
import com.groupeisi.companyspringboot.mapper.UserMapper;
import com.groupeisi.companyspringboot.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.context.MessageSource;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    private IUserDao userDao ;
    private UserMapper userMapper;
    private MessageSource messageSource;

    @Override
    public List<UserDto> getAll() {
        return userMapper.listUserEntityToListUserDto(userDao.findAll());
    }

    @Override
    public UserDto save(UserDto userDto) {
        String email = userDto.getEmail();
        Optional<UserEntity> existingUser = userDao.findByEmail(email);
        if (existingUser.isPresent()) {
            throw new DuplicateException(String.format("User with the email address '%s' already exists.", email));
        }

        return userMapper.toUserDto(userDao.save(userMapper.toUserEntity(userDto)));
    }

    @Override
    public Optional<UserDto> login(String email, String password) {
        return userDao.findByEmailAndPassword(email, password)
                .map(userEntity -> Optional.of(userMapper.toUserDto(userEntity))
                ).orElseThrow(
                        () -> new EntityNotFoundException(
                                messageSource.getMessage("user.notfound",
                                        new Object[]{email, password},
                                        Locale.getDefault())
                        ));
    }
}
