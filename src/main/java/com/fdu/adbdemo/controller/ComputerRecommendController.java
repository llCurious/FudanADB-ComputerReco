package com.fdu.adbdemo.controller;

import com.fdu.adbdemo.DO.Computer;
import com.fdu.adbdemo.DO.Cpu;
import com.fdu.adbdemo.repos.ComputerRepository;
import com.fdu.adbdemo.repos.CpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComputerRecommendController {

    @Autowired
    public ComputerRepository computerRepository;

    @Autowired
    public CpuRepository cpuRepository;


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

    /**
     * CPU 增删改查
     * */
    @GetMapping("/findCpus")
    public List<Cpu> findCpus() {
        System.out.println("findCpus");
        for ( Cpu cpu: cpuRepository.findAll()) {
            System.out.println(cpu);
        }
        return cpuRepository.findAll();
    }

    @GetMapping("/findCpusByPriceBefore")
    public List<Cpu> findCpusByPriceBefore(@RequestParam Long price) {
        System.out.println("findCpusByPriceBefore");
        for ( Cpu cpu: cpuRepository.findCpuByPriceBeforeOrderByPrice(price)) {
            System.out.println(cpu);
        }
        return cpuRepository.findCpuByPriceBeforeOrderByPrice(price);
    }

    @GetMapping("/findCpusByName")
    public List<Cpu> findCpusByName(@RequestParam String name) {
        System.out.println("findCpusByName");
        for ( Cpu cpu: cpuRepository.findCpuByName(name)) {
            System.out.println(cpu);
        }
        return cpuRepository.findCpuByName(name);
    }

}
