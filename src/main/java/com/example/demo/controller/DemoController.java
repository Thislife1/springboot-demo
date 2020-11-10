package com.example.demo.controller;

import com.example.demo.domain.vo.SwaggerVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangpeng
 * @date 2020/11/10 10:20 上午
 */
@Slf4j
@RestController
@Api(tags = "SpringBoot---Demo")
public class DemoController {

    @GetMapping("/swagger3/test")
    @ApiOperation("打印输入参数")
    public void demo(SwaggerVO swagger){
        System.out.println(swagger);
    }

}
