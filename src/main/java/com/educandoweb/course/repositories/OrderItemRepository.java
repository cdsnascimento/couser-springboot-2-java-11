package com.educandoweb.course.repositories;

import java.util.List;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<User, Long>  {

	void saveAll(List<OrderItem> asList);
    
}
