package com.curtjenk.grilloff.server.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.curtjenk.grilloff.server.model.Judge;

@Repository
public interface JudgeRepository extends JpaRepository<Judge, Long>{

}