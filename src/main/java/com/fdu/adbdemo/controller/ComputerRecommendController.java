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

@CrossOrigin
@RestController
public class ComputerRecommendController {

    @Autowired
    public LaptopRepository laptopRepository;


    /**
     * Laptop 增删改查
     * */
    @CrossOrigin
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
    @CrossOrigin
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

    @CrossOrigin
    @RequestMapping(value = "/laptops", method = RequestMethod.POST)
    public List<Laptop> findLaptops(@RequestBody LaptopRequestBody request) {
        System.out.println("laptops");
        System.out.println(request);
        final int num = 50;
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
        return res.subList(0, Math.min(num, res.size()));
    }

    @CrossOrigin
    @RequestMapping(value = "/recommendation", method = RequestMethod.POST)
    public List<Laptop> recommendation(@RequestBody RecommendRequest request) {
        System.out.println("recommend");
        List<Laptop> res;
        final int num = 20;
        System.out.println(request);
        String scenario = request.getScenario();
        // TODO: 根据 scenario 推荐笔记本, ["商务", "学生", "代码", "游戏", "稳定耐用", "艺术创作"] 这六种
        res = laptopRepository.findAll();
        switch (scenario) {
            case "商务":
                Collections.sort(res, new Comparator<Laptop>() {
                    @Override
                    public int compare(Laptop o1, Laptop o2) {
                        return o2.getSsd() - o1.getSsd();
                    }
                });
                break;
            case "学生":
                Collections.sort(res, new Comparator<Laptop>() {
                    @Override
                    public int compare(Laptop o1, Laptop o2) {
                        return o2.getSales() - o1.getSales();
                    }
                });
                break;
            case "代码":
                Collections.sort(res, new Comparator<Laptop>() {
                    @Override
                    public int compare(Laptop o1, Laptop o2) {
                        return o2.getMemory() - o1.getMemory();
                    }
                });
                break;
            case "游戏":
                Collections.sort(res, new Comparator<Laptop>() {
                    @Override
                    public int compare(Laptop o1, Laptop o2) {
                        return o2.getPrice() - o1.getPrice();
                    }
                });
                break;
            case "稳定耐用":
                Collections.sort(res, new Comparator<Laptop>() {
                    @Override
                    public int compare(Laptop o1, Laptop o2) {
                        return o2.getSsd() - o1.getSsd();
                    }
                });
                break;
            case "艺术创作":
                Collections.sort(res, new Comparator<Laptop>() {
                    @Override
                    public int compare(Laptop o1, Laptop o2) {
                        return (o2.getScreen_size() - o1.getScreen_size()) > 0? 1 : -1;
                    }
                });
                break;
            default:
                res = new ArrayList<>();
                break;
        }
        res = res.subList(0, Math.min(num, res.size()));
        return res;
    }
}
