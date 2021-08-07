package com.SpringSecurity.demoJwt.repositories;

import com.SpringSecurity.demoJwt.common.ERole;
import com.SpringSecurity.demoJwt.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleReporitory extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);
}
