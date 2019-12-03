package com.fdu.adbdemo.controller;

import com.fdu.adbdemo.DO.Laptop;
import com.fdu.adbdemo.DO.LaptopRequestBody;
import com.fdu.adbdemo.DO.RecommendRequest;
import com.fdu.adbdemo.DO.SmallRequest;
import com.fdu.adbdemo.repos.LaptopRepository;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ComputerRecommendController {

    @Autowired
    public LaptopRepository laptopRepository;


    /**
     * Laptop 增删改查
     * */
    @PostMapping("/addComputer")
    public void addComputerPOST(@RequestParam Laptop laptop) {
        laptopRepository.save(laptop);
    }

    @RequestMapping(value = "/addComputer", method = RequestMethod.GET)
    public void addComputerGET(@RequestParam long id, @RequestParam long price) {
        Laptop laptop = new Laptop();
        laptopRepository.save(laptop);
    }

    @GetMapping("/findComputers")
    public List<Laptop> findComputers() {
        System.out.println("findComputers");
        for ( Laptop Laptop: laptopRepository.findAll()) {
            System.out.println(Laptop);
        }
        return laptopRepository.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/props", method = RequestMethod.POST)
    public HashMap<String, List<String>> findProps() {
        System.out.println("props");
        String [] keys = {"cpus", "memory", "screen_size", "resolution",
                "video_card", "video_memory", "interval", "ssd", "hdd", "brand"};
        HashMap<String, List<String>> props = new HashMap<>();

        props.put("cpus", laptopRepository.findCpuCategories());
        props.put("memory", laptopRepository.findMemoryCategories());
        props.put("screen_size", laptopRepository.findScreenSizeCategories());
        props.put("resolution", laptopRepository.findResolutionCategories());
        props.put("video_card", laptopRepository.findVideoCardCategories());
        props.put("video_memory", laptopRepository.findVideoMemoryCategories());
        props.put("interval", laptopRepository.findIntervalCategories());
        props.put("ssd", laptopRepository.findSsdCategories());
        props.put("hdd", laptopRepository.findHddCategories());
        props.put("brand", laptopRepository.findBrandCategories());
        props.put("sort", new ArrayList<>(Arrays.asList("price", "sales", "best")));
        props.put("scenario", new ArrayList<>(Arrays.asList("商务", "学生", "代码", "游戏", "稳定耐用", "艺术创作")));
        return props;
    }

    @RequestMapping(value = "/laptops", method = RequestMethod.POST)
    public List<Laptop> findLaptops(@RequestBody LaptopRequestBody request) {
        System.out.println("laptops");
        System.out.println(request);

        List<Laptop> res;
        switch (request.getSort_policy()) {
            case "price":
                res = laptopRepository.findLaptopsByAttrsOrderByPrice(request.getBrand(), request.getCpu(),
                        request.getMemory(), request.getSsd(), request.getHdd(),
                        request.getInterval(), request.getVideo_card(), request.getVideo_memory(),
                        request.getScreen_size(), request.getResolution());
                break;
            case "sales":
                res = laptopRepository.findLaptopsByAttrsOrderBySales(request.getBrand(), request.getCpu(),
                        request.getMemory(), request.getSsd(), request.getHdd(),
                        request.getInterval(), request.getVideo_card(), request.getVideo_memory(),
                        request.getScreen_size(), request.getResolution());
                break;
            case "best":
                res = laptopRepository.findLaptopsByAttrs(request.getBrand(), request.getCpu(),
                        request.getMemory(), request.getSsd(), request.getHdd(),
                        request.getInterval(), request.getVideo_card(), request.getVideo_memory(),
                        request.getScreen_size(), request.getResolution());
                // 按照price/sales排序
                Collections.sort(res);
                break;
            default:
                res = new ArrayList<>();
                break;
        }
        if (request.isReverse()) Collections.reverse(res);
//        return laptopRepository.findLaptopsByCpu(request.getCpu());
//        return  laptopRepository.findLaptopsByScreen(request.getScreen_size());
//        return laptopRepository.findLaptopsByResolution(request.getResolution());
        return res;
    }

    @RequestMapping(value = "/recommend", method = RequestMethod.POST)
    public List<Laptop> recommendation(@RequestBody RecommendRequest request) {
        System.out.println("recommend");
        String scenario = request.getScenario();
        // TODO: 根据 scenario 推荐笔记本

        return null;
    }
}
