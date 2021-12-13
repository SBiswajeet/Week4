package com.lti.Producer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.Producer.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
