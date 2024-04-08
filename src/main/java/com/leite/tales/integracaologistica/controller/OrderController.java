package com.leite.tales.integracaologistica.controller;

import com.leite.tales.integracaologistica.dto.response.OrderDTOResponse;
import com.leite.tales.integracaologistica.service.OrderService;

import jakarta.annotation.Resource;
import jakarta.validation.Valid;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "*")
public class OrderController {

  @Autowired
  private OrderService service;

  /*
  @GetMapping
  public List<OrderDTOResponse> getOrders() {
    List<OrderDTOResponse> orders;
    orders = service.getOrders();
    return orders;
  }
   */

  @PostMapping("/integracao")
  @Valid
  public HttpStatus integrarPedidos(@RequestPart MultipartFile file) {
    return HttpStatus.OK;
  }

}
