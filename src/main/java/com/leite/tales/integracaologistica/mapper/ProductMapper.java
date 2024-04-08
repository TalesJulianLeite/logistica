package com.leite.tales.integracaologistica.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.leite.tales.integracaologistica.domain.Product;
import com.leite.tales.integracaologistica.dtos.ProductDto;

@Component
public class ProductMapper {

    @Autowired
    private ModelMapper modelMapper;

    public ProductDto toDto(Product product) {
        return modelMapper.map(product, ProductDto.class);
    }

    public List<ProductDto> toDtoList(List<Product> products) {
        return products.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }


    public Product fromDto(ProductDto productDto) {
        return modelMapper.map(productDto, Product.class);
    }

}
