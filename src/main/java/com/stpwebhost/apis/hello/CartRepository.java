package com.stpwebhost.apis.hello;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<cart, Long> {
}