package com.leite.tales.integracaologistica.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Table(name = "user")
@Data
@Entity
public class User {

  @Id
  @Column(name = "user_id")
  @SequenceGenerator(name = "user_id_seq", sequenceName = "user_id_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
  private int userId;

  @Column(name = "name")
  private String name;

  @OneToMany(mappedBy = "userId")
  private List<Order> orders;

}
