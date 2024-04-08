package com.leite.tales.integracaologistica.domain.converter;

import java.util.List;

import org.springframework.stereotype.Component;

import com.leite.tales.integracaologistica.domain.Order;
import com.leite.tales.integracaologistica.dto.request.OrderDtoRequest;
import com.leite.tales.integracaologistica.dto.response.OrderDtoResponse;

@Component
public interface IOrderConverter {
  public List<OrderDtoResponse> toOrderResponse(List<Order> orders);
  public List<Order> toOrder(List<OrderDtoRequest> ordersDto);

}
