package com.tigrex.rules.processor.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName(value = "groovy_script")
public class GroovyScript implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "script_code")
    private String scriptCode;
    @TableField(value = "script_name")
    private String scriptName;
    @TableField(value = "script")
    private String script;
    @TableField(value = "memo")
    private String memo;
}
