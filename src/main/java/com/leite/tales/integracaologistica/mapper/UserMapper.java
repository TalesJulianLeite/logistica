package com.leite.tales.integracaologistica.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.leite.tales.integracaologistica.domain.User;
import com.leite.tales.integracaologistica.dto.UserDto;

@Component
public class UserMapper {

    @Autowired
    private ModelMapper modelMapper;

    public UserDto toDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }

    public List<UserDto> toDtoList(List<User> users) {
        return users.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public User fromDto(UserDto userDto) {
        return modelMapper.map(userDto, User.class);
    }

}
