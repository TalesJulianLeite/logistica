package com.leite.tales.integracaologistica.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.leite.tales.integracaologistica.dto.response.OrderDtoResponse;
import com.leite.tales.integracaologistica.infrastructre.IntegrationProperties;
import com.leite.tales.integracaologistica.service.impl.IntegrationServiceImpl;
import com.leite.tales.integracaologistica.service.impl.OrderServiceImpl;

@Controller
@RequestMapping("/order")
@CrossOrigin(origins = "*")
public class OrderController {


	private IntegrationProperties integrationProperties;

	private IntegrationServiceImpl integrationService;

	private OrderServiceImpl orderService;

	public OrderController() {
		this.orderService = new OrderServiceImpl();
        this.integrationProperties = new IntegrationProperties();
        this.integrationService = new IntegrationServiceImpl(integrationProperties);
	}


	@GetMapping("/get/{filter}/{value}")
	public List<OrderDtoResponse> getOrders(@PathVariable("filter") String filter, @PathVariable("value") String value) {
		List<OrderDtoResponse> orders;
		orders = orderService.getOrders(filter, value);
		return orders;
	}


	@PostMapping("/integration")
	public HttpStatus handleFileUpload(@RequestParam("file") MultipartFile file,
			RedirectAttributes redirectAttributes) {
		this.integrationService.store(file);
		redirectAttributes.addFlashAttribute("message",
				"You successfully uploaded " + file.getOriginalFilename() + "!");

		return HttpStatus.CREATED;
	}



}
