package com.virgo.springbucks.entity;

import javax.persistence.*;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;

/**
 * @author GUOYUNXI
 * @date 2020/8/29 11:14
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public class BaseEntity implements Serializable {
    @Id  //设置主键
    @GenericGenerator(name = "IdentityIdGenerator",strategy = "identity")
    @GeneratedValue(generator = "IdentityIdGenerator")
    private Long id;

    @CreatedDate()
    @Column(name = "create_at",updatable = false)  //设置数据库中表的列名=create_at,并且不允许更新
    private Date createTime;

    @UpdateTimestamp
    @Column(name = "update_at")
    private Date updateTime;
}
