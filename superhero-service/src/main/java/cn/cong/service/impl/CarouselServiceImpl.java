package cn.cong.service.impl;

import cn.cong.mapper.CarouselMapper;
import cn.cong.pojo.Carousel;
import cn.cong.service.CarouselService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarouselServiceImpl implements CarouselService {
    @Resource
    private CarouselMapper carouselMapper;

    @Override
    public List<Carousel> queryAll() {
        Example example = new Example(Carousel.class);
        List<Carousel> carouselList = carouselMapper.selectByExample(example);
        return carouselList;
    }
}
