package com.leite.tales.integracaologistica.service;

import com.leite.tales.integracaologistica.domain.converter.OrderConverter;
import com.leite.tales.integracaologistica.dto.response.OrderDTOResponse;
import com.leite.tales.integracaologistica.domain.Order;
import com.leite.tales.integracaologistica.repository.impl.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  @Autowired
  private OrderRepository repository;
  @Autowired
  private Order order;
  private OrderConverter converter;

  private OrderDTOResponse getOrderByFilter(String filterName, String filterValue) {
    return null;
  }

}
