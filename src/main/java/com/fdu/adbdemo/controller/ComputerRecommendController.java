package com.fdu.adbdemo.controller;

import com.fdu.adbdemo.DO.Computer;
import com.fdu.adbdemo.DO.Cpu;
import com.fdu.adbdemo.DO.Gpu;
import com.fdu.adbdemo.repos.ComputerRepository;
import com.fdu.adbdemo.repos.CpuRepository;
import com.fdu.adbdemo.repos.GpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComputerRecommendController {

    @Autowired
    public ComputerRepository computerRepository;


    /**
     * Computer 增删改查
     * */
    @PostMapping("/addComputer")
    public void addComputerPOST(@RequestParam Computer computer) {
        computerRepository.save(computer);
    }

    @RequestMapping(value = "/addComputer", method = RequestMethod.GET)
    public void addComputerGET(@RequestParam long id, @RequestParam long price) {
        Computer computer = new Computer(id, price);
        computerRepository.save(computer);
    }

    @GetMapping("/findComputers")
    public List<Computer> findComputers() {
        System.out.println("findComputers");
        for ( Computer computer: computerRepository.findAll()) {
            System.out.println(computer);
        }
        return computerRepository.findAll();
    }
}
