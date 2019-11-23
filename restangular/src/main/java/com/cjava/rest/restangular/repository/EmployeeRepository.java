package com.cjava.rest.restangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjava.rest.restangular.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
