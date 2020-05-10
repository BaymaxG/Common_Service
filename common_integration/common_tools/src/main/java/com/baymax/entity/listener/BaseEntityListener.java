/**
 * Copyright © 2020-2020 BaymaxG.guNingbo
 */

package com.baymax.entity.listener;

import com.baymax.entity.BaseEntity;
import lombok.Data;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

/**
 * @author guNingbo
 * @since 2020/5/10
 */
@Data
public class BaseEntityListener {
    /**
     * 被 @PrePersist- 在新实体持久化之前（添加到EntityManager）
     * 被 @PostPersist- 在数据库中存储新实体（在commit或期间flush）
     * 被 @PostLoad - 从数据库中检索实体后。
     * 被 @PreUpdate- 当一个实体被识别为被修改时EntityManager
     * 被 @PostUpdate- 更新数据库中的实体（在commit或期间flush）
     * 被 @PreRemove - 在EntityManager中标记要删除的实体时
     */
    @PrePersist
    public void prePersist(BaseEntity entity) {
        entity.setCreateAccount(12345678L);
        entity.setCreateBy("test");
        entity.setCreateDate(new Date());
        entity.setLastUpdateBy("test-first");
        entity.setLastUpdateAccount(12345678L);
        entity.setLastUpdateDate(new Date());
    }

    @PreUpdate
    public void preUpdate(BaseEntity entity) {
        entity.setLastUpdateBy("test-after");
        entity.setLastUpdateAccount(87654321L);
        entity.setLastUpdateDate(new Date());
    }
}
