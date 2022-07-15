package com.estsoft.pilotauth.domain.user.repository;

import com.estsoft.pilotauth.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUid(String uid);
}
