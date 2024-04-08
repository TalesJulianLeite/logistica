package com.leite.tales.integracaologistica.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.leite.tales.integracaologistica.domain.Order;
import com.leite.tales.integracaologistica.dto.OrderDto;
import com.leite.tales.integracaologistica.dto.ProductDto;

@Component
public class OrderMapper {

	@Autowired
	private ModelMapper modelMapper;

	public OrderDto toDto(Order order) {
		return modelMapper.map(order, OrderDto.class);
	}

	public List<OrderDto> toDtoList(List<Order> orders) {
		return orders.stream().map(this::toDto).collect(Collectors.toList());
	}

	public Order fromDto(ProductDto orderDto) {
		return modelMapper.map(orderDto, Order.class);
	}

}
