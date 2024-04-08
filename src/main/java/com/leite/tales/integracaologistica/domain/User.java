package com.leite.tales.integracaologistica.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Table(name = "user")
@Data
@Entity
public class User {

	@Id
	@SequenceGenerator(name = "user_id_seq", sequenceName = "user_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "user_id_seq")
	private Long id;
	
	@Column(name = "user_id", length = 10, unique = true)
	@Valid
	@NotNull
	private Long userId;
	

	@Column(name = "name", length = 45)
	@Valid
	@NotNull
	private String name;

	@OneToMany(mappedBy = "userId")
	@NotNull
	private List<Order> orders;

}
