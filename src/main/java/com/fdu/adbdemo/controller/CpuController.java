//package com.fdu.adbdemo.controller;
//
//import com.fdu.adbdemo.DO.Cpu;
//import com.fdu.adbdemo.repos.CpuRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class CpuController {
//
//    @Autowired
//    public CpuRepository cpuRepository;
//
//    /**
//     * CPU 增删改查
//     * */
//    @GetMapping("/findCpus")
//    public List<Cpu> findCpus() {
//        System.out.println("findCpus");
//        for ( Cpu cpu: cpuRepository.findAll()) {
//            System.out.println(cpu);
//        }
//        return cpuRepository.findAll();
//    }
//
//    @GetMapping("/findCpusByPriceBefore")
//    public List<Cpu> findCpusByPriceBefore(@RequestParam Long price) {
//        System.out.println("findCpusByPriceBefore");
//        for ( Cpu cpu: cpuRepository.findCpuByPriceBeforeOrderByPrice(price)) {
//            System.out.println(cpu);
//        }
//        return cpuRepository.findCpuByPriceBeforeOrderByPrice(price);
//    }
//
//    @GetMapping("/findCpusByName")
//    public List<Cpu> findCpusByName(@RequestParam String name) {
//        System.out.println("findCpusByName");
//        for ( Cpu cpu: cpuRepository.findCpuByTitle(name)) {
//            System.out.println(cpu);
//        }
//        return cpuRepository.findCpuByTitle(name);
//    }
//}
