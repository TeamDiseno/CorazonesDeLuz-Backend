package com.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.entities.InstitucionEntity;



public interface IInstitutionRepository extends JpaRepository<InstitucionEntity,Integer>{

}
