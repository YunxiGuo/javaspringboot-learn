package com.virgo.springbucks.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author GUOYUNXI
 * @date 2020/9/3 16:53
 */
@Data
public class CreateCoffeeInput implements Serializable {
    @ApiModelProperty(value = "名称",required = true)
    private String name;

    @ApiModelProperty(name = "价格",required = true)
    private Double price;
}
