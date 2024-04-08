package com.leite.tales.integracaologistica.domain;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Table(name = "order")
@Data
@Entity
public class Order {

  @Id
  @SequenceGenerator(name = "order_id_seq", sequenceName = "order_id_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "order_id_seq")
  private Long id;
  
  @Column(name = "order_id", unique = true)
  @NotNull
  @Valid
  private Long orderId;

  //@Column(nullable = false, name = "total_order")
  @Transient
  @Valid
  private Double totalOrder;

  @NotNull
  @Valid
  @Column(nullable = false, name = "date")
  private Date date;

  @NotNull
  @OneToMany(mappedBy = "orderItemId", fetch = FetchType.LAZY)
  private List<OrderItem> itens;

  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name = "user_id", referencedColumnName = "user_id")
  @NotNull
  private User userId;

}
