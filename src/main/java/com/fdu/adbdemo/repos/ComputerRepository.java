package com.fdu.adbdemo.repos;

import com.fdu.adbdemo.DO.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer, Long> {

}
