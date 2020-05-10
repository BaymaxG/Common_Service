/**
 * Copyright © 2020-2020 BaymaxG.guNingbo
 */

package com.baymax.entity;

import com.baymax.entity.listener.BaseEntityListener;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.util.Date;

/**
 * @author guNingbo
 * @since 2020/5/10
 */
@Data
@MappedSuperclass
@EntityListeners(BaseEntityListener.class)
public class BaseEntity {
    @Id
    @GeneratedValue(generator = "sys_uid")
    @GenericGenerator(name = "sys_uid", strategy = "uuid")
    @Column(name = "id", columnDefinition = "VARCHAR(255) COMMENT '主键'")
    private String id;

    @Column(name = "delete_flag", columnDefinition = "VARCHAR(1) COMMENT '删除标记'")
    private String deleteFlag;

    @Column(name = "create_by", columnDefinition = "VARCHAR(200) COMMENT '创建人'", updatable = false)
    private String createBy;

    @Column(name = "create_account", columnDefinition = "BIGINT(20)  COMMENT '创建人账号'", updatable = false)
    private long createAccount;

    @Column(name = "create_date", updatable = false, columnDefinition = "DATETIME COMMENT '创建时间'")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;

    @Column(name = "last_update_by", columnDefinition = "VARCHAR(200) COMMENT '最后更新人'")
    private String lastUpdateBy;

    @Column(name = "last_update_account", columnDefinition = "BIGINT(20) COMMENT '最后更新人账号'")
    private long lastUpdateAccount;

    @Column(name = "last_update_date", columnDefinition = "DATETIME COMMENT '最后更新时间'")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastUpdateDate;

    @Version
    @Column(name = "version", columnDefinition = "INT COMMENT '版本号'")
    private int version;
}
