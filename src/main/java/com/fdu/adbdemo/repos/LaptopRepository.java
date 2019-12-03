package com.fdu.adbdemo.repos;

import com.fdu.adbdemo.DO.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
//    @Query("select laptop from laptops laptop where laptop.price<:price")
//    List<Laptop> findCpuByPriceBeforeOrderByPrice(@Param("price")Long price);

//    @Query("select laptop from laptops laptop where laptop.product=:product")
//    List<Laptop> findCpuByTitle(@Param("title")String product);

    @Query("select laptop from Laptop laptop where laptop.brand in :brand and laptop.cpu in :cpu and laptop.memory in :memory and laptop.ssd in :ssd and laptop.hdd in :hdd and laptop.interval in :interval and laptop.video_card in :video_card and laptop.video_memory in :video_memory and laptop.screen_size in :screen_size and laptop.resolution in :resolution")
    List<Laptop> findLaptopsByAttrs(@Param("brand")List<String> brand,
                                                 @Param("cpu")List<String> cpu,
                                                 @Param("memory")List<Integer> memory,
                                                 @Param("ssd")List<Integer> ssd,
                                                 @Param("hdd")List<Integer> hdd,
                                                 @Param("interval")List<String> interval,
                                                 @Param("video_card")List<String> video_card,
                                                 @Param("video_memory")List<String> video_memory,
                                                 @Param("screen_size")List<Double> screen_size,
                                                 @Param("resolution")List<String> resolution);

    @Query("select laptop from Laptop laptop where laptop.brand in :brand and laptop.cpu in :cpu and laptop.memory in :memory and laptop.ssd in :ssd and laptop.hdd in :hdd and laptop.interval in :interval and laptop.video_card in :video_card and laptop.video_memory in :video_memory and laptop.screen_size in :screen_size and laptop.resolution in :resolution order by laptop.price")
    List<Laptop> findLaptopsByAttrsOrderByPrice(@Param("brand")List<String> brand,
                                                 @Param("cpu")List<String> cpu,
                                                 @Param("memory")List<Integer> memory,
                                                 @Param("ssd")List<Integer> ssd,
                                                 @Param("hdd")List<Integer> hdd,
                                                 @Param("interval")List<String> interval,
                                                 @Param("video_card")List<String> video_card,
                                                 @Param("video_memory")List<String> video_memory,
                                                 @Param("screen_size")List<Double> screen_size,
                                                 @Param("resolution")List<String> resolution);

    @Query("select laptop from Laptop laptop where laptop.brand in :brand and laptop.cpu in :cpu and laptop.memory in :memory and laptop.ssd in :ssd and laptop.hdd in :hdd and laptop.interval in :interval and laptop.video_card in :video_card and laptop.video_memory in :video_memory and laptop.screen_size in :screen_size and laptop.resolution in :resolution order by laptop.sales")
    List<Laptop> findLaptopsByAttrsOrderBySales(@Param("brand")List<String> brand,
                                                 @Param("cpu")List<String> cpu,
                                                 @Param("memory")List<Integer> memory,
                                                 @Param("ssd")List<Integer> ssd,
                                                 @Param("hdd")List<Integer> hdd,
                                                 @Param("interval")List<String> interval,
                                                 @Param("video_card")List<String> video_card,
                                                 @Param("video_memory")List<String> video_memory,
                                                 @Param("screen_size")List<Double> screen_size,
                                                 @Param("resolution")List<String> resolution);


    @Query("select laptop from Laptop laptop where laptop.cpu in :cpu")
    List<Laptop> findLaptopsByCpu(@Param("cpu")List<String> cpu);

    @Query("select laptop from Laptop laptop where laptop.ssd in :ssd")
    List<Laptop> findLaptopsBySsd(@Param("ssd")List<Integer> ssd);

    @Query("select laptop from Laptop laptop where laptop.screen_size in :screen_size")
    List<Laptop> findLaptopsByScreen(@Param("screen_size")List<Double> screen_size);

    @Query("select laptop from Laptop laptop where laptop.resolution in :resolution")
    List<Laptop> findLaptopsByResolution(@Param("resolution")List<String> resolution);

    @Query("select laptop.cpu from Laptop laptop group by laptop.cpu")
    List<String> findCpuCategories();

    @Query("select laptop.memory from Laptop laptop group by laptop.memory")
    List<String> findMemoryCategories();

    @Query("select laptop.screen_size from Laptop laptop group by laptop.screen_size")
    List<String> findScreenSizeCategories();

    @Query("select laptop.resolution from Laptop laptop group by laptop.resolution")
    List<String> findResolutionCategories();

    @Query("select laptop.video_card from Laptop laptop group by laptop.video_card")
    List<String> findVideoCardCategories();

    @Query("select laptop.video_memory from Laptop laptop group by laptop.screen_size")
    List<String> findVideoMemoryCategories();

    @Query("select laptop.interval from Laptop laptop group by laptop.interval")
    List<String> findIntervalCategories();

    @Query("select laptop.ssd from Laptop laptop group by laptop.ssd")
    List<String> findSsdCategories();

    @Query("select laptop.hdd from Laptop laptop group by laptop.hdd")
    List<String> findHddCategories();

    @Query("select laptop.brand from Laptop laptop group by laptop.brand")
    List<String> findBrandCategories();


}
