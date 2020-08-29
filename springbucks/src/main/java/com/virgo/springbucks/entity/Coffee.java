package com.virgo.springbucks.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.joda.money.Money;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author GUOYUNXI
 * @date 2020/8/29 11:12
 * 咖啡
 */
@Entity  //这个类与数据库表映射
@Data
@Table(name = "t_coffee")
@NoArgsConstructor
@AllArgsConstructor
public class Coffee extends BaseEntity{
    private String name;
    @Column
    @Type(type = "org.jadira.usertype.moneyandcurrency.joda.PersistentMoneyAmount",
            parameters = {@org.hibernate.annotations.Parameter(name = "currencyCode", value = "CNY")})
    private Money price;
}
