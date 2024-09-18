package com.dev.shopdienthoai.demo.repository;

import com.dev.shopdienthoai.demo.domain.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
    boolean existsByEmail(String email);
    Subscriber findByEmail(String email);
}
