package com.spring.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.data.jpa.entity.SalgradeEntity;

@Repository
public interface SalgradeRepository extends JpaRepository<SalgradeEntity, Long> {

}
