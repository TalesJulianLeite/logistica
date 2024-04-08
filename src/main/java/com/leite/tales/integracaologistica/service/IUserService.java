package com.leite.tales.integracaologistica.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.leite.tales.integracaologistica.domain.Order;
import com.leite.tales.integracaologistica.domain.User;
import com.leite.tales.integracaologistica.dto.UserDto;
import com.leite.tales.integracaologistica.dto.request.OrderDtoRequest;
import com.leite.tales.integracaologistica.dto.response.OrderDtoResponse;

@Service
public interface IUserService {
	
	List<User> saveUsers(List<User> users);
	List<User> convertOrderDtoToUser(List<OrderDtoRequest> ordersDto);
	List<UserDto> convertOrderToUserDto(List<Order> orders);

}
