package com.leite.tales.integracaologistica.domain.converter;

import com.leite.tales.integracaologistica.domain.Order;
import com.leite.tales.integracaologistica.dto.request.OrderDTORequest;
import com.leite.tales.integracaologistica.dto.response.OrderDTOResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

@Component
public interface OrderConverter {
  public OrderDTOResponse toOrderResponse(Order order);
  public Order toOrder(OrderDTORequest request);

}
