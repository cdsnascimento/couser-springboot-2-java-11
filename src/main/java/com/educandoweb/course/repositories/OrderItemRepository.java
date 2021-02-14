package com.educandoweb.course.repositories;

import java.util.List;

import com.educandoweb.course.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {

}
