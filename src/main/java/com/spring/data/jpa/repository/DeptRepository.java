package com.spring.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.data.jpa.entity.DeptEntity;

@Repository
public interface DeptRepository extends JpaRepository<DeptEntity, Long> {

}
