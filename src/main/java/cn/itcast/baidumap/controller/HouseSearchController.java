package cn.itcast.baidumap.controller;

import cn.itcast.baidumap.service.HouseSearchService;
import cn.itcast.baidumap.vo.HouseResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/house/search")
@RestController
public class HouseSearchController {

    @Autowired
    private HouseSearchService houseSearchService;
    @GetMapping
    public List<HouseResultVo> search(@RequestParam("maxLongitude") Double maxLongitude,
                                      @RequestParam("minLongitude") Double minLongitude,
                                      @RequestParam("maxLatitude") Double maxLatitude,
                                      @RequestParam("minLatitude") Double minLatitude,
                                      @RequestParam("zoom") Double zoom){
    return this.houseSearchService.search(maxLongitude,minLongitude,maxLatitude,minLatitude,zoom);
    }
}
