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
@TableName(value = "model")
public class Model implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableField(value = "kind_code")
    private String kindCode;
    @TableField(value = "model_code")
    private String modelCode;
    @TableField(value = "model_name")
    private String modelName;
}
