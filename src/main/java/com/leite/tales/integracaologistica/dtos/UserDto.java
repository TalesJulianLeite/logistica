package com.leite.tales.integracaologistica.dtos;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
	
	@Valid
	@NotNull
	@NotEmpty
	@Schema(description = "Id do usuário", maxLength = 10)
	private Long userId;
	
	@Valid
	@NotNull
	@NotBlank
	@NotEmpty
	@Schema(description = "Nome do usuário", maxLength = 45)
	private String userName;
	
	@Schema(description = "Lista de pedidos do usuário")
	@NotNull
	private List<OrderDto> orders;
}
