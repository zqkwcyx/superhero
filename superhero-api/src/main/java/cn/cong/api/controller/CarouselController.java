package cn.cong.api.controller;

import cn.cong.pojo.Carousel;
import cn.cong.service.CarouselService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("carousel")
public class CarouselController {
    @Resource
    private CarouselService carouselService;

    @RequestMapping("list")
    public List<Carousel> getCarouselList(){
        return carouselService.queryAll();
    }
}
