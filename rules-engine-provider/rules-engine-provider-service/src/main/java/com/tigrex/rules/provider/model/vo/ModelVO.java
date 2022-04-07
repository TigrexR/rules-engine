package com.tigrex.rules.provider.model.vo;

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
public class ModelVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String kindCode;
    private String modelCode;
    private String modelName;
}
