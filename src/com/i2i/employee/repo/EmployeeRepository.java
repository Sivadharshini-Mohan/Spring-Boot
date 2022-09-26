package com.i2i.employee.repo;

import com.i2i.employee.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
    public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    @Query("SELECT employee FROM Employee employee where employee.status = :status")
    Collection<Employee> findAllByActive(@Param("status") String status);
}

