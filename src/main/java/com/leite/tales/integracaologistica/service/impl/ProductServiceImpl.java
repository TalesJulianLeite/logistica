package com.leite.tales.integracaologistica.service.impl;

import org.springframework.stereotype.Service;

import com.leite.tales.integracaologistica.repository.impl.ProductRepositoryImpl;
import com.leite.tales.integracaologistica.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {
	
	private final ProductRepositoryImpl productRepository;

    ProductServiceImpl(ProductRepositoryImpl productRepository) {
        this.productRepository = productRepository;
    }
}
