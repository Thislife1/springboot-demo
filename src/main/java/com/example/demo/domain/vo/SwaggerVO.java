package com.example.demo.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author huangpeng
 * @date 2020/11/10 11:23 上午
 */
@Data
@ApiModel
public class SwaggerVO {
    @ApiModelProperty(value="用户名", required=true)
    private String name;

    @ApiModelProperty(value="年龄", required=true)
    private Integer age;
}
