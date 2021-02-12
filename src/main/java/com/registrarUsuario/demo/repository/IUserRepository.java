package com.registrarUsuario.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registrarUsuario.demo.entity.User;

public interface IUserRepository extends JpaRepository<User, Integer> {



}
