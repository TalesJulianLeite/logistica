package com.leite.tales.integracaologistica.dto.request;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;


@Data
public class OrderDtoRequest {
	
	@NotNull
	@Valid
	@Size(min = 1, max = 10)
	@JsonProperty("userId")
	private Long userId;
	
	@Valid
	@NotNull
	@Size(min = 1, max = 45)
	@JsonProperty("userName")
	private String userName;
	
	@Valid
	@NotNull
	@Size(min = 1, max = 10)
	@JsonProperty("orderId")
	private Long orderId;
	
	@Valid
	@NotNull
	@Size(min = 1, max = 10)
	@JsonProperty("prodId")
	private Long prodId;

	@Valid
	@NotNull
	@Positive
	@JsonProperty("value")
	private Double value;
	
	@Valid
	@NotNull
	@JsonProperty("date")
	private Date date;
	

}
