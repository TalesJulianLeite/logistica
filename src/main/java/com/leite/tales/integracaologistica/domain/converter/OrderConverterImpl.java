package com.leite.tales.integracaologistica.domain.converter;

import java.util.List;

import com.leite.tales.integracaologistica.domain.Order;
import com.leite.tales.integracaologistica.dto.request.OrderDtoRequest;
import com.leite.tales.integracaologistica.dto.response.OrderDtoResponse;

public class OrderConverterImpl implements IOrderConverter {

	@Override
	public List<OrderDtoResponse> toOrderResponse(List<Order> orders) {
		return null;
	}

	@Override
	public List<Order> toOrder(List<OrderDtoRequest> request) {
		return null;
	}

}
