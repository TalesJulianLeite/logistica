package com.leite.tales.integracaologistica.util;

import java.util.Date;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.leite.tales.integracaologistica.domain.Order;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Component
public abstract class OrderSpecification implements Specification<Order> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long orderId;
	private Date dateOrder;
	@Override
	public Predicate toPredicate(Root<Order> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		// TODO Auto-generated method stub
		return null;
	}
}
