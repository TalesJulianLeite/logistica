package com.leite.tales.integracaologistica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.leite.tales.integracaologistica.domain.Order;
import com.leite.tales.integracaologistica.dto.request.OrderDtoRequest;
import com.leite.tales.integracaologistica.dto.response.OrderDtoResponse;

@Service
public interface IOrderService {
	
	List<OrderDtoResponse> getOrders(String filter, String value);
	List<Order> saveOrders(List<Order> orders);
	List<Order> convertOrderDtoToOrder(List<OrderDtoRequest> ordersDto);
	List<OrderDtoResponse> convertOrderToOrderDto(List<Order> orders);

}
