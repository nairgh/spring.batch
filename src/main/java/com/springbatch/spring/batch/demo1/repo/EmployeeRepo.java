package com.springbatch.spring.batch.demo1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbatch.spring.batch.demo1.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String> {
}
