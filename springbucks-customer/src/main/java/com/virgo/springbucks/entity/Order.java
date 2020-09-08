package com.virgo.springbucks.entity;

import com.virgo.springbucks.entity.enums.EnumOrderState;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * @author GUOYUNXI
 * @date 2020/8/29 13:37
 * 订单
 */
@Entity
@Table(name = "t_order")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel(value = "Order",description = "订单信息")
public class Order extends BaseEntity{

    /**
     * 顾客
     */
    @Column()
    private String customer;

    @ManyToMany  //标识对应关系
    @JoinTable(name = "t_order_coffee")
    private List<Coffee> items;

    /**
     * 订单的状态
     */
    @Column(nullable = false)
    @Enumerated
    private EnumOrderState state;
}
