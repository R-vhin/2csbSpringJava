package com.samplefullstack2csb.samplefullstack.repository;

import com.samplefullstack2csb.samplefullstack.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
