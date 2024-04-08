package com.leite.tales.integracaologistica.repository;

import com.leite.tales.integracaologistica.domain.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<Order, Long> {

  List<Order> findOrderbyFilter(String filterName, String filterValue);
}
