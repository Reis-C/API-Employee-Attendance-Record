package com.digitalinnovationone.employeeattendancerecord.repository;

import com.digitalinnovationone.employeeattendancerecord.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}