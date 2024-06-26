package com.leite.tales.integracaologistica.dto;

import java.util.List;

import lombok.Data;

@Data
public class OrderDto {

	private long order_id;
	private String total;
	private String date;
	private List<ProductDto> products;
}
