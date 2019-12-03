//package com.fdu.adbdemo.controller;
//
//import com.fdu.adbdemo.DO.Gpu;
//import com.fdu.adbdemo.DO.Ram;
//import com.fdu.adbdemo.repos.GpuRepository;
//import com.fdu.adbdemo.repos.RamRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class HardwareController {
//
//    @Autowired
//    public GpuRepository gpuRepository;
//
//    @Autowired
//    public RamRepository ramRepository;
//
//    /**
//     * GPU 增删改查
//     * */
////    @GetMapping("/findGpus")
////    public List<Gpu> findGpus() {
////        System.out.println("findGpus");
////        for ( Gpu gpu: gpuRepository.findAll()) {
////            System.out.println(gpu);
////        }
////        return gpuRepository.findAll();
////    }
//
//    @RequestMapping("/findRams")
//    public List<Ram> findRams() {
//        System.out.println("findRams");
//        for ( Ram ram: ramRepository.findAll()) {
//            System.out.println(ram);
//        }
//        return ramRepository.findAll();
//    }
//
//}
