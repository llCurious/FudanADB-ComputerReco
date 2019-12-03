//package com.fdu.adbdemo.controller;
//
//import com.fdu.adbdemo.DO.Gpu;
//import com.fdu.adbdemo.repos.GpuRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class GpuController {
//
//    @Autowired
//    public GpuRepository gpuRepository;
//
//    /**
//     * GPU 增删改查
//     * */
//    @GetMapping("/findGpus")
//    public List<Gpu> findGpus() {
//        System.out.println("findGpus");
//        for ( Gpu gpu: gpuRepository.findAll()) {
//            System.out.println(gpu);
//        }
//        return gpuRepository.findAll();
//    }
//}
