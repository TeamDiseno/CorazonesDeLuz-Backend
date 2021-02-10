package com.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.entity.User;

public interface IRepositoryUser extends JpaRepository<User, Integer> {

}
