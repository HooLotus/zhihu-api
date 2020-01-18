package com.scs.soft.zhihu.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.scs.soft.zhihu.api.mapper")
@EnableSwagger2
public class ZhihuApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhihuApiApplication.class, args);
    }

}
