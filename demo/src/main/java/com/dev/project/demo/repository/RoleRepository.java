package com.dev.shopdienthoai.demo.repository;

import com.dev.shopdienthoai.demo.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>, JpaSpecificationExecutor<Role> {
    public boolean existsByName(String name);
    Role findByName(String name);
}
