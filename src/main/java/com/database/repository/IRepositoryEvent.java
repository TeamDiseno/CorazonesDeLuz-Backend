package com.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.entity.Event;

public interface IRepositoryEvent extends JpaRepository< Event , Integer> {

}
