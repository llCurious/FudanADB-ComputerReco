package com.fdu.adbdemo.repos;

import com.fdu.adbdemo.DO.Cpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CpuRepository extends JpaRepository<Cpu, Long> {

    @Query("select cpu from Cpu cpu where cpu.price<:price")
    List<Cpu> findCpuByPriceBeforeOrderByPrice(@Param("price")long price);

    @Query("select cpu from Cpu cpu where cpu.name=:name")
    List<Cpu> findCpuByName(@Param("name")String name);
}
