package com.leite.tales.integracaologistica.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDto {
	
	@Positive
	@Valid
	@NotNull
	@NotBlank
	@Schema(description = "Id do produto", maxLength = 10)
	private long product_id;
	
	@Valid
	@NotNull
	@NotBlank
	@Schema(description = "Id do produto", maxLength = 12)
	private String value;
	
}
