package com.leite.tales.integracaologistica.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.List;
import lombok.Data;
@Table(name = "order")
@Data
@Entity
public class Order {

  @Id
  @Column(name = "order_id")
  @SequenceGenerator(name = "order_id_seq", sequenceName = "order_id_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_id_seq")
  private Long orderId;

  @Column(nullable = false, name = "total")
  private Double total;

  @Column(nullable = false, name = "date")
  private Date date;

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "product_order",
      joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "product_id"),
      inverseJoinColumns = @JoinColumn(name = "order_id", referencedColumnName = "order_id"))
  private List<Product> products;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User userId;

}
