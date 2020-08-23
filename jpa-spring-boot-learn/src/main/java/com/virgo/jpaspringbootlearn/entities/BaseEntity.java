package com.virgo.jpaspringbootlearn.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author GUOYUNXI
 * @date 2020/8/23 10:42
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public abstract class BaseEntity implements Serializable {

    @Id
    @GenericGenerator(name = "IdentityIdGenerator",strategy = "identity")
    @GeneratedValue(generator = "IdentityIdGenerator")
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_at",nullable = false,updatable = false)
    @CreatedDate
    private Date createAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_at",nullable = false)
    @LastModifiedDate
    private Date updateAt;
}
