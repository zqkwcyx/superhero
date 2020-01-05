package cn.cong.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.cong.mapper")
@ComponentScan("cn.cong")
public class SuperheroApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(SuperheroApiApplication.class, args);
    }

}
