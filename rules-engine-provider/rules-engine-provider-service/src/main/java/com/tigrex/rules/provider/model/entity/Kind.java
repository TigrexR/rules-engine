package com.tigrex.rules.provider.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author linus
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName(value = "kind")
public class Kind implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableField(value = "kind_code")
    private String kindCode;
    @TableField(value = "kind_name")
    private String kindName;
}
