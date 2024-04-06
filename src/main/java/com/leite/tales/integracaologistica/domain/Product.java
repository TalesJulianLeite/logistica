package com.leite.tales.integracaologistica.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product {

  @Column(name = "product_id")
  private Long productId;

  @Column(name = "value", length = 10, precision = 2)
  private Double value;

  @ManyToMany(mappedBy = "products")
  private List<Order> orders;

}
