package com.leite.tales.integracaologistica.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leite.tales.integracaologistica.domain.Order;
import com.leite.tales.integracaologistica.domain.converter.OrderConverterImpl;
import com.leite.tales.integracaologistica.dto.request.OrderDtoRequest;
import com.leite.tales.integracaologistica.dto.response.OrderDtoResponse;
import com.leite.tales.integracaologistica.repository.impl.OrderRepositoryImpl;
import com.leite.tales.integracaologistica.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	private OrderRepositoryImpl repository;

	@Autowired
	private OrderConverterImpl converter;
	

	List<OrderDtoResponse> ordersDtoRequest = null;

	public List<OrderDtoResponse> getOrders(String filter, String value) {
		List<OrderDtoResponse> ordersDto = null;
		List<Order> orders = null;
		try {
			orders = this.repository.findOrderbyFilter(filter, value);
			if(Objects.nonNull(orders)) {
				convertOrderToOrderDto(orders);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return ordersDto;
	}

	@Override
	public List<Order> saveOrders(List<Order> orders) {
		return this.repository.saveAll(orders);
	}

	@Override
	public List<Order> convertOrderDtoToOrder(List<OrderDtoRequest> ordersDto) {
		return this.converter.toOrder(ordersDto);
	}

	@Override
	public List<OrderDtoResponse> convertOrderToOrderDto(List<Order> orders) {
		return this.converter.toOrderResponse(orders);
	}

}
